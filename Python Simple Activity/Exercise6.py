total = 0
count = 0
average = 0
data = input("Enter a number or press enter to quit: ")

while data:
    count += 1
    number = data
    total += int(number)
    average = total / count
    data = input("Enter a number or press enter to quit: ")

print("The sum is {0}. The average is {1}.".format(total, average))