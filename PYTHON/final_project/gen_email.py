def email_gen(list_of_names):
    emails = []
    for i in list_of_names:
        letter = 1
        while i[2] + '.' + i[1][0:letter] + '@company.io' in emails:
            letter += 1
        emails.append(i[2] + '.' + i[1][0:letter] + '@company.io')
    return emails