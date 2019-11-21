package Sorting;

import java.util.Scanner;

public class Selection {
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        System.out.println("Enter 5 Elements in the Array");
        Scanner s=new Scanner(System.in);
        int arr[] = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        System.out.println("Original Array");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}

