package D.S.Sorting;

import java.util.Queue;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of Elements To Be Sorted");
        int n = s.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int digits=0;
        while(max!=0) {
            digits++;
            max /= 10;
        }
        for(int i=0;i<digits;i++){

        }
    }
}
