# Пирамидка
num = input()
num = int(num)

i = 1
strings = []
while i <= num:
    some_str = ''
    k = 0
    j = num - i
    while k < j:
        some_str += ' '
        k += 1
    if i == 1:
        some_str += str(1)
    else:
        c = i
        while c > 1:
            some_str += str(c)
            c -= 1
        while c <= i:
            some_str += str(c)
            c += 1
    k = 0
    while k < j:
        some_str += ' '
        k += 1
    print(some_str)
    i += 1
    strings.append(some_str)

i = len(strings)
i -= 2
while i >= 0:
    print(strings[i])
    i -= 1


# Ромбик
print('Ромбик')
num = input()
num = int(num)

i = 1
while i <= num:
    some_str = ''
    k = 0
    count = num - i
    while k <= count:
        some_str += ' '
        k += 1
    if i == 1:
        some_str += str(1)
    else:
        for z in range(1, i + 1, 1):
            some_str += str(z)
    print(some_str)
    i += 1

i = 0
spaces = ''
while i <= num:
    spaces += ' '
    i += 1

while num > 0:
    some_str = '' + spaces
    for z in range(num, 0, -1):
        some_str += str(z)
    print(some_str)
    num -= 1