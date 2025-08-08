
def find_maximum_minimum():
    arr = []
    temp=[]
    n = int(input("Enter number of num:"))
    
    for i in range(n):
        arr.append(int(input("Enter the value:")))
    arr.sort()
    min_val = arr[0]
    max_value=arr[len(arr)-1]
    temp.append(min_val)
    temp.append(max_value)
    return temp
print(find_maximum_minimum() )  

