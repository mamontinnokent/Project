def email_gen(list_of_names):
    emails = []
    for i in list_of_names:
        letter = 1
        while i[2] + '.' + i[1][0:letter] + '@company.io' in emails:
            letter += 1
        emails.append(i[2] + '.' + i[1][0:letter] + '@company.io')
    return emails


file = open('task_file.txt', 'r')
strings = []

for string in file:
    line = string.split(', ')
    if len(line[1]) == 0 or len(line[2]) == 0 or (line[1][0] < 'A' or line[1][0] > 'Z') or ('A' > line[2][0] or line[2][0] > 'Z'):
        continue
    strings.append(line)

file.close()

listEmails = email_gen(strings)
for i in range(1, len(strings)):
    strings[i][0] += listEmails[i]

file = open('task_file.txt', 'w')

line = strings[0]
string = '' + line[0] + ', ' + line[1] + ', ' + line[2] + ', ' + line[3] + ', ' + line[4]

file.write(string)

for j in range(1, len(strings)):
    line = strings[j]
    string = '' + line[0] + ', ' + line[1] + ', ' + line[2] + ', ' + line[3] + ', ' + line[4]

    file.write(string)