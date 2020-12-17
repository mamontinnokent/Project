def contains(string, value):
    count = string.find(value)
    if count == -1:
        return False
    else:
        return True


def check_pass(password):
    nbr = '1234567890'
    spec_symbols = '!@#$%^&*()-+'
    lower_case_let = 'abcdefghijklmnopqrstuvwxyz'
    upper_case_let = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    flags = [False, False, False, False]

    for i in nbr:
        if contains(password, i):
            flags[0] = True

    for z in spec_symbols:
        if contains(password, z):
            flags[1] = True

    for x in lower_case_let:
        if contains(password, x):
            flags[2] = True

    for a in upper_case_let:
        if contains(password, a):
            flags[3] = True

    for fl in flags:
        if fl is False:
            return False

    return True