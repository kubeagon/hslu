def summe(n):
    if n == 1:
        return 1
    else:
        return n + summe(n - 1)


if __name__ == "__main__":
    # Test the function
    n = int(input("Enter a number: "))
    result = summe(n)
    print(f"summe({n}) = {result}")