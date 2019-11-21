package Sorting;

import java.util.Scanner;

public class Insertion {
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
    }

    static void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String args[])
    {
        System.out.println("Enter 5 Elements in the Array");
        Scanner s=new Scanner(System.in);
        int arr[] = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        System.out.println("Original Array");
        print(arr);
        sort(arr);
        System.out.println("Sorted array");
        print(arr);
    }
}
