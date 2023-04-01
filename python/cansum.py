
import sys
sys.setrecursionlimit(10000)

def canSum(sum, args):

    if sum in data.keys():
        return data[sum];

    if sum == 0:
        return 1    

    if sum < 0:
        return 0    

    for key in args: 
        diff = sum - key;
        if canSum(diff, args) == 1:
            data[sum] = 1;
            return 1;
        
    data[sum] = 0
    return 0


print("This is my can sum program to learning Dynamic Programming....")
sum = 7000

data = dict()
result = canSum(sum, [5, 3, 4, 7])
print("Result for sum [" + str(sum) + "] -> " + str(result))