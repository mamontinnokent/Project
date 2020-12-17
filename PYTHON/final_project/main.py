import re
from gen_email import email_gen
from gen_pass import generate_password


def check_line(strings_list):
    flag = True
    flags = [False, False, False]

    if re.match(r'[A-Z][a-z]+', strings_list[1]) is not None and re.match(r'[A-Z][a-z]+', strings_list[2]) is not None: # Имя и фамилия
        flags[0] = True
    if len(strings_list[1]) != 0 and len(strings_list[2]) != 0:
        flags[1] = True
    if len(strings_list[3]) == 7:
        flags[2] = True

    for iterator in flags:
        if iterator is False:
            flag = False

    return flag


# Чтение файла
file = open('task_file.txt', 'r')
strings = []

for string in file:
    line = string.split(', ')
    if line[0] == 'EMAIL' and line[1] == 'NAME' and line[2] == 'LAST_NAME':
        strings.append(line)
    if check_line(line):
        strings.append(line)

file.close()

strings[0][0] += ', PASSWORD'

listEmails = email_gen(strings)
for i in range(1, len(strings)):
    strings[i][0] += listEmails[i] + ', ' + generate_password()



# Запись в файл
file = open('task_file.txt', 'w')

line = strings[0]
string = '' + line[0] + ', ' + line[1] + ', ' + line[2] + ', ' + line[3] + ', ' + line[4]

file.write(string)

for j in range(1, len(strings)):
    line = strings[j]
    string = '' + line[0] + ', ' + line[1] + ', ' + line[2] + ', ' + line[3] + ', ' + line[4]

    file.write(string)
