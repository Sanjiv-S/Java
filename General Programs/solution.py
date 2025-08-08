"""class Solution:
    def rotate(arr):
       temp = []
       for i in range(1):
           temp.append(arr[len(arr)-1])
           for j in range(len(arr)-1):
               temp.append(arr[j])
       return temp  
    arr =[9, 8, 7, 6, 4, 2, 1, 3]
    print(rotate(arr))
"""


def fourSum(nums, target):
    temp = []*4
    for i in nums:
        if i<=0:
            if abs(i) in nums:
                temp.append(i)
                temp.append(abs(i))
    sumation=sum(temp[:])
    if sumation ==target:
        print(temp)
nums=[1,0,-1,0,-2,2]
target=0
fourSum(nums,target)