
def getNthNumber(n):

    if n in data.keys():
        return data[n];

    if n == 1 or n == 2:
        return 1
    
    a = n-1
    b = n-2

    x = getNthNumber(a)
    y = getNthNumber(b)
    z = x + y
    data[n] = z

    return z


print("This is my Feb Seq for learning Dynamic Programming..")
n = 500

data = dict()
an = getNthNumber(n)
print(str(n) + "th number in my Feb Seq  -> " + str(an))
