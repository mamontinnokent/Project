def contains(string, value):
    count = string.find(value)
    if count == -1:
        return False
    else:
        return True


password = input('Введите свой пароль: ')
forbiddenSymb = password


flagLenPass = False

flagNbr = False
nbr = '1234567890'

flagSpecSymb = False
specSymb = '!@#$%^&*()-+'

flagLowerCaseLet = False
lowerCaseLet = 'abcdefghijklmnopqrstuvwxyz'

flagUpperCaseLet = False
upperCaseLet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

if len(password) >= 12:
    flagLenPass = True

for i in nbr:
    if contains(password, i):
        flagNbr = True
    forbiddenSymb = forbiddenSymb.replace(i, '')

for z in specSymb:
    if contains(password, z):
        flagSpecSymb = True
    forbiddenSymb = forbiddenSymb.replace(z, '')

for x in lowerCaseLet:
    if contains(password, x):
        flagLowerCaseLet = True
    forbiddenSymb = forbiddenSymb.replace(x, '')

for a in upperCaseLet:
    if contains(password, a):
        flagUpperCaseLet = True
    forbiddenSymb = forbiddenSymb.replace(a, '')

if flagLenPass == True and flagLowerCaseLet == True and flagUpperCaseLet == True and flagSpecSymb == True and flagNbr == True and len(forbiddenSymb) == 0:
    print('Сильный пароль.')
elif len(forbiddenSymb) != 0:
    print('Ошибка. Запрещенный спецсимвол.')
else:
    print('Слабый пароль. Рекомендации: ', end = '')
    if flagLenPass == False:
        print('увеличить число символов - ' + str(12 - len(password)), end = '')
        if flagLowerCaseLet == False or flagUpperCaseLet == False or flagSpecSymb == False or flagNbr == False:
            print(', ', end = '')
    if flagNbr == False:
        print('добавить 1 число', end = '')
        if flagLowerCaseLet == False or flagUpperCaseLet == False or flagSpecSymb == False:
            print(', ', end = '')
    if flagLowerCaseLet == False:
        print('добавить 1 строчную букву', end = '')
        if flagUpperCaseLet == False or flagSpecSymb == False:
            print(', ', end = '')
    if flagUpperCaseLet == False:
        print('добавить 1 заглавную букву', end = '')
        if flagSpecSymb == False:
            print(', ', end = '')
    if flagSpecSymb == False:
        print('добавить 1 специальный символ')
