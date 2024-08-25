package csci2011.justicelab6;

/**
 *
 * @author Jacqueline Justice
 */
public class JusticeLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Displaying the array with 8 items with the displayArray method
         */
        System.out.println("Displaying array with 8 items");
        int[] arraySearch = {68, 24, 93, 98, 11, 54, 19, 36};
        displayArray(arraySearch, 0);
        System.out.println();

        /*
        Displaying the displayReverse method on "Hello World!"
         */
        System.out.println("Calling displayReverse (\"" + "Hello World!" + "\")");
        displayReverse("Hello World! ");

        /*
        Displaying the factorials of 5 and 20 with the factorial method
         */
        System.out.println("\n\nCalling factorial(5)");
        System.out.println("result: " + factorial(5));

        System.out.println("\nCalling factorial(20)");
        System.out.println("result: " + factorial(20));

        /*
        Displaying an array after the binarySearch that 
        searched for the index of number 14
         */
        int[] arrayBinary = {3, 6, 11, 14, 19, 23, 28, 33, 37};
        System.out.println("\nCalling binarySearch to search for 14");
        System.out.println("\nresult: " + binarySearch(arrayBinary, 14));

        /*
        Displaying the quicksort method on an array 
         */
        int[] arrQuickSort = {68, 24, 93, 98, 11, 54, 19, 36,};
        System.out.println("\nArray before calling quicksort");
        displayArray(arrQuickSort, 0);

        System.out.println("\nArray after calling quicksort");
        quicksort(arrQuickSort, 0, arrQuickSort.length - 1);
        displayArray(arrQuickSort, 0);
    }

    /*
    a private static void method called displayArray that takes an
    array of Ints and an index integer
    
    if the index is the same as the array length, it does nothing
    Otherwise, displays the items in the array with 3 spaces inbetween
     */
    private static void displayArray(int[] arr, int index) {
        if (index == arr.length) {
            System.out.println();

        } else {
            int item = arr[index];
            System.out.printf("%3d", item);
            displayArray(arr, index + 1);
        }
    }

    /*
    A public static void method called displayArray that takes
    an array of Ints and displays the array using the displayArray
    method above
     */
    public static void displayArray(int[] arr1) {
        displayArray(arr1, 0);
    }

    /*
    a public static void called displayReverse that takes a string 
    as an argument
    
    If the length of the string is 0, it does nothing
    
    Otherwise, passes a substring of the string without the first 
    character to a recursive call, then displays the first 
    character
     */
    public static void displayReverse(String s) {
        if (s.length() == 0) {

        } else {
            displayReverse(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    /*
    a public static long method called factorial that takes an int
    as an argement 
    
    If the number is less than or equal to 1, returns 1
    
    Otherwise, returns the product of n and (n - 1)!
     */
    public static long factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);

        }

    }

    /*
    a private static void method called displayArrayIndexes that
    takes an array of Integers and 4 ints arguments represetning the 
    current, first, middle and last indexes
     */
    private static void displayArrayIndexes(int[] arr, int current,
            int first, int middle, int last) {
        //if the current is equal to the array length, it does nothing
        if (current == arr.length) {
            System.out.println();
            /*
            Otherwise, displays the item at the current
            index:
            
            An F if the current index is equal to the first index 
            
            An M is the current index is equal to the middle index
            
            An L if the current index is equal to the last index
             */
        } else {
            //if the current is equal to the first, middle, and last indexes
            if (current == first && current == middle && current == last) {
                System.out.printf("%3s", "FML");
                //if the current is equal to the first and middle indexes
            } else if (current == first && current == middle) {
                System.out.printf("%3s", "FM");
                //if the current is equal to the last and middle indexes
            } else if (current == last && current == middle) {
                System.out.printf("%3s", "ML");
            } else {

                //otherwise, if the current is equal to the first index
                if (current == first) {
                    System.out.printf("%3s", "F");
                    //if the current is equal to the middle index
                } else if (current == middle) {
                    System.out.printf("%3s", "M");
                    //if the current is equal to the last index
                } else if (current == last) {
                    System.out.printf("%3s", "L");
                    //othwerwise, just prints a blank 
                } else {
                    System.out.printf("%3s", " ");
                }

            }
            /*
             incrementing the current indexes
            
            using a recursive case to run the method
             */
            current = current + 1;
            displayArrayIndexes(arr, current, first, middle, last);
        }
    }

    /*
    a private static int method called binarySearch that takes an array
    of integers and 3 integers representing the item to search for,
    and the first and last indexes 
     */
    private static int binarySearch(int[] arr, int item, int first, int last) {
        //returns -1 if the item is not found/variable
        int result = -1;
        //if the first index is less than the last index, performs the search
        if (first <= last) {
            //declaring the middle index
            int mid = (first + last) / 2;
            System.out.println();
            //calling the displayArray to display the array
            displayArray(arr);
            //calling the displayArrayIndexes to display the 3 array indexes
            displayArrayIndexes(arr, 0, first, mid, last);

            //recursive binary search
            if (item == arr[mid]) {
                result = mid;
            } else if (item < arr[mid]) {
                result = binarySearch(arr, item, first, mid - 1);
            } else {
                result = binarySearch(arr, item, mid + 1, last);
            }

        }
        //otherwise, return -1
        return result;

    }

    //public overloaded method for the prviate method binarySearch
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }


    /*
    private static void method called swap that takes an array of 
    integers, and 2 ints representing the first and last indexes
     */
    private static void swap(int[] arr, int index1, int index2) {
        //creating a variable for the array at index1
        int temp = arr[index1];
        //swaping the indexes
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /*
    a private static int method called partition that takes an array of 
    integers and 3 ints representing the pivot point and the first and 
    last indexes
     */
    private static int partition(int[] arr, int pivot, int first, int last) {
        //initializing i to the start at the first index
        int i = first - 1;
        int j = last;

        //while i is less than j do, does the following
        while (i < j) {
            //increments i until the array element at index i
            //if greater than the pivot value or i has reached the 
            //last index
            do {
                i++;
                //if i is still less than j, swap the iteams at the 2 locations
                //swap(arr, i ,j);
                if(i < j){
                swap(arr, i + 1,j);
            }
            } while (arr[i] < pivot && i < last);

           //decrement j until the array element at index j 
           // is less than the pivot value or j has reached
           //the first index
            do {
                j--;
               //swap(arr, i, j);
               if(i < j){
                swap(arr, i + 1,j);
            }
            } while (arr[j] > pivot && j > first);
            if(i < j){
                swap(arr, i,j);
            }
        }
        
        return j;
    }

    /*
    a private static void method called quicksort that takes an array of 
    integers and 2 ints representing the first and last indexes
     */
    private static void quicksort(int[] arr, int first, int last) {
        //if the first index is greater than the last index, does nothing
        if (first >= last) {
            return;
            /*
           otherwise, calls the partition method to partition the 
           range of the array from the first index to the last index
           using the first item as the pivot point
             */
        } else {
            //declaring a variable for the returned partition value
            int item = partition(arr, arr[last], first, last);
            //calls the swap method to swap the item at the first index
            //wiith the item at the pivot index returned by partition
            swap(arr, first, item);
            //using a recursive call to sort the range from the first index
            //to the index right before the pivot index
            quicksort(arr, first, item - 1);
            //using another recursive call to sort the range from the 
            //index right after the pivot index to the last index
            quicksort(arr, item + 1, last);
        }
    }

    /*
    a public static void method for the private method quicksort that
    takes an array of integers and uses the private quixksort method
    to sort the entire array
     */
    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

}
