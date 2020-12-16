def clc(string):
    assert type(string) == str

    if string.find('+') != -1:
        strings = string.split('+')
        return int(strings[0]) + int(strings[1])
    elif string.find('**') != -1:
        strings = string.split('**')
        if len(strings) == 2 and len(strings[1]) != 0:
            return int(strings[0]) ** int(strings[1])
        else:
            return int(strings[0]) ** 2
    elif string.find('*') != -1:
        strings = string.split('*')
        return int(strings[0]) * int(strings[1])
    elif string.find('-') != -1:
        strings = string.split('-')
        return int(strings[0]) - int(strings[1])
    elif string.find('/') != -1:
        strings = string.split('/')
        return int(strings[0]) / int(strings[1])
    elif string.find('%') != -1:
        strings = string.split('%')
        return int(strings[0]) / 100