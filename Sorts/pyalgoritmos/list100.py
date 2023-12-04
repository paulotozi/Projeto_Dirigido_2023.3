import random
def selectionSort(array):

    size = len(array)
    
    for ind in range(size):
        
        min_index = ind
 
        for j in range(ind + 1, size):
            
            # select the minimum element in every iteration
            if array[j] < array[min_index]:
                
                min_index = j
        
        # swapping the elements to sort the array
        (array[ind], array[min_index]) = (array[min_index], array[ind])

def bubbleSort(arr):
    
    n = len(arr)
    
    # optimize code, so if the array is already sorted, it doesn't need
    # to go through the entire process
    swapped = False
    
    # Traverse through all array elements
    for i in range(n-1):
        
        # range(n) also work but outer loop will
        # repeat one time more than needed.
        # Last i elements are already in place
        for j in range(0, n-i-1):
 
            # traverse the array from 0 to n-i-1
            # Swap if the element found is greater
            # than the next element
            if arr[j] > arr[j + 1]:
                
                swapped = True
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
         
        if not swapped:
            # if we haven't needed to make a single swap, we 
            # can just exit the main loop.
            return

def insertionSort(arr):
 
    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):
 
        key = arr[i]
 
        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
        j = i-1
        
        while j >= 0 and key < arr[j] :
                
                arr[j + 1] = arr[j]
                j -= 1
        
        arr[j + 1] = key

list100py = []

while(len(list100py) < 100):
    
    num = random.randint(0, 100)

    list100py.append(num)

print(selectionSort(list100py))