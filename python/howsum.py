
import sys
sys.setrecursionlimit(10000)


def howSum(sum, args, myKey, myList):

    if sum in data.keys():
        return data[sum]

    if sum == 0 and myKey != checkInt:
        myList.append(myKey)
        return myList

    if sum < 0:
        return myList

    for key in args:
        diff = sum - key

        myTempList = howSum(diff, args, key, myList)

        if len(myTempList) > len(myList):
            data[sum] = myTempList
            return myTempList

    data[sum] = myList
    return myList


print("This is my how sum program to learning Dynamic Programming....")
sum = 7
checkInt = -999
myList = []

data = dict()
howSum(sum, [5, 3, 4, 7], checkInt, myList)
print("Result for sum [" + str(sum) + "] -> " + str(myList))
