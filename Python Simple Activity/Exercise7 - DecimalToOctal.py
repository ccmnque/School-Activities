decimal = int(input("Enter a decimal integer: "))
print("Quotient Remainder Octal")
bstring = " "
while decimal > 0:
    remainder = decimal % 8
    decimal = decimal // 8
    bstring = str(remainder) + bstring
    print ("%5d%8d%12s" % (decimal, remainder, bstring))
print("The octal representation is", bstring)
