string = input()
strings = string.split(' ')

for i in strings:
    string = string.replace(i, i.capitalize())

print(string)