from stegano import lsb

secret = lsb.hide("original_image.png", "This is a secret message.")
secret.save("stego_image.png")

revealed_message = lsb.reveal("stego_image.png")
print("Revealed message:", revealed_message)    