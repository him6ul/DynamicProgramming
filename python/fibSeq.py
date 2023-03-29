def getNthNumber(n):
    if n == 1 or n == 2:
        return 1

    return getNthNumber(n-1) + getNthNumber(n-2)


print("This is my Feb Seq for learning Dynamic Programming..")
n = 10

an = getNthNumber(n+2)
print(str(n) + "th number in my Feb Seq  -> " + str(an))
