some_str = "Abracadabra"

print(some_str[2])
print(some_str[len(some_str) - 2])
print(some_str[:5])
print(some_str[:len(some_str) - 2])

letter = 0
while letter < len(some_str):
    if (letter) % 2 != 0:
        print(some_str[letter], end = '')
    letter += 1
print('')

letter = 0
while letter < len(some_str):
    if (letter) % 2 == 0:
        print(some_str[letter], end = '')
    letter += 1
print('')

letter = len(some_str) - 1
while letter >= 0:
    print(some_str[letter], end = '')
    letter -= 1
print('')

reversString = ''
letter = len(some_str) - 1
while letter >= 0:
    reversString += some_str[letter]
    letter -= 1
print(reversString[ : :2])

print(len(some_str))