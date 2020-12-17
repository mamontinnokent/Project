from random import *
from check_pass import check_pass

def choice(arr_char):
    return arr_char[randint(0, len(arr_char) - 1)]


def generate_password():
    nbr_str = '1234567890'
    spec_symbols = '!@#$%^&*()-+'
    lower_case_let = 'abcdefghijklmnopqrstuvwxyz'
    upper_case_let = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    password = ''
    flag = True
    arr = [nbr_str, spec_symbols, lower_case_let, upper_case_let]

    while flag is True:
        while len(password) < 12:
            password += choice(arr[randint(0, 3)])
        if check_pass(password):
            return password
        else:
            password = ''
