
def gridTraveller(m, n):

    key = str(m) + "_" + str(n)
    if key in data.keys():
        return data[key];

    if m == 0 or n == 0:
        return 0;

    if m == 1 or n == 1:
        return 1;

    x = gridTraveller(m-1, n)
    y = gridTraveller(m, n-1)
    z = x + y
    data[key] = z

    return z


print("This is my Grid Traveller to learning Dynamic Programming....")
n = 50

data = dict()
an = gridTraveller(18, 18)
print("Number of ways to travel the grid is -> " + str(an))
