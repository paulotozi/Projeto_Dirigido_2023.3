import java.util.*;
import java.io.*;
import java.lang.*;


public class list1000 {
    
    public static void selectionSort(int[] arr){  
        
        for (int i = 0; i < arr.length - 1; i++){  
            
            int index = i;  
            
            for (int j = i + 1; j < arr.length; j++){  
                
                if (arr[j] < arr[index]){  
                    
                    index = j;//searching for lowest index  
                
                }  
            
            }  
            
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        
        }  
    
    }
    static void bubbleSort(int[] arr) {  
        
        int n = arr.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++){  
                
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){

                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
                          
            }  
        }
    }
    public static void insertionSort(int arr[]){
        
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) {
            
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            
           while (j >= 0 && arr[j] > key) {
                
                arr[j + 1] = arr[j];
                j = j - 1;
            
            }
            
            arr[j + 1] = key;
        
        }
    
    }  
    public static void main(String[] args) 
    { 
        
        int min = 1;
        int max = 1001;
        
        int list1000java[] = new int[1001];

        for(int i = 0; i < 1001; i++){

            Random random = new Random();
            int num = random.nextInt(max - min) + min;

            list1000java[i] = num;

        }

        int new_list1000java[] = new int[1001];
        new_list1000java = list1000java;
        insertionSort(new_list1000java);

        // for(int i = 0; i < 1001; i++){

        //     System.out.printf("%d ", list100java[i]);

        // }
        // System.out.println("over");

        for(int i = 0; i < 1001; i++){

            System.out.printf("%d ", new_list1000java[i]);

        }

    }
    
}