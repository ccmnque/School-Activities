# Task 1

print("\n")
print("\nTask 1 Starts Here")

data = [5, 3, 7]

Task1Data = [
    data[2],
    data[-1],
    len(data),
    data[0:2],
    0 in data,
    data + [2, 10, 5],
    tuple(data),
]

for i in Task1Data:
    print(i)

print("\n")
print("\n")
print("\nTask 2 Starts Here")

# Task 2

Task2Data = data.copy()
Task2Data[0] = -Task2Data[0]
print(Task2Data)
Task2Data[-1] += 10
print(Task2Data)
Task2Data.insert(2, 22)
print(Task2Data)
Task2Data.pop(1)
print(Task2Data)
Task2Data.sort()
print(Task2Data)

print("\n")
print("\n")
