listNbr = [1, 2, 3, 4, 5]
print(listNbr[::2])

listNbr = [9, 4, 5, 2, 3]
print(listNbr[::2])

listNbr = [7, 8]
print(listNbr[::2])

listNbr = [90, 45, 3, 43]
for i in range(0, len(listNbr), 1):
    if i % 2 == 0:
        print(listNbr[i])

flagComma = False

listNbr = [1, 2, 3, 4, 5]
for i in range(1, len(listNbr)):
    if listNbr[i] > listNbr[i - 1]:
        if flagComma == True:
            print(', ', end = '')
        print(listNbr[i], end = '')
        if flagComma == False:
            flagComma = True

listNbr = [1, 2, 3, 4, 5]
minNbr = min(listNbr)
maxNbr = max(listNbr)

print(listNbr)

for i in range(0, len(listNbr)):
    if listNbr[i] == maxNbr:
        listNbr[i] = minNbr
    elif listNbr[i] == minNbr:
        listNbr[i] = maxNbr

print(listNbr)