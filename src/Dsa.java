import java.util.Arrays;

public class Dsa {
    public static void main(String[] args) {
        int[] arr = {1, 12, 14, 5, 7, 19, 17};
        int[] arr1 = {1, 1, 2, 3, 4, 5, 3, 4, 5, 6, 2, 8, 3, 6, 3, 7, 8};
        System.out.println(xorExample4(4, 3));
    }

    static int xorExample4(int number, int bit) {              //Set nth bit of m = 0
        return (number & ~(1 << bit - 1));
    }

    static int xorExample3(int number, int bit) {              //Set nth bit of m = 1
        return number | (1 << bit - 1);
    }

    static int xorExample2(int number, int bit) {              //Find nth bit of m
        return (number & (1 << bit - 1)) >> bit - 1;
    }

    static int xorExample1(int[] arr) {         //Every number in arr is repeated even times, find the one which is not.
        int num =0;
        for (int i : arr) {
            num^=i;
        }
        return num;
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static long fibonacciFormula(int n){
        return (long) ((1/Math.sqrt(5))*(Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)));
    }

    static int recursiveBinarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target > arr[mid]){
            return recursiveBinarySearch(arr, target, mid + 1, end);
        }
        return recursiveBinarySearch(arr, target, start, mid - 1);
    }

    static int recursionFibonacci(int n){
        if(n < 2){
            return n;
        }
        return recursionFibonacci(n-1) + recursionFibonacci(n-2);
    }

    static void cyclicSort(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(i != correct){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i -1;
            int max = maxIndex(arr, 0,last);
            swap(arr, max, last);
        }
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            //if no swap for a particular value of i, array is sorted
            if(!swapped){
                break;
            }
        }
    }

    static int maxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
