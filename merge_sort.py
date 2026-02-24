a = list(map(int, input("Enter first sorted array: ").split()))
b = list(map(int, input("Enter second sorted array: ").split()))

i = j = 0
merged = []

while i < len(a) and j < len(b):
    if a[i] < b[j]:
        merged.append(a[i])
        i += 1
    else:
        merged.append(b[j])
        j += 1

while i < len(a):
    merged.append(a[i])
    i += 1

while j < len(b):
    merged.append(b[j])
    j += 1

print("Merged sorted array:", merged)
