package arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

//Print the left element
//https://practice.geeksforgeeks.org/problems/print-the-left-element/0
/*Given a array of length N, at each step it is reduced by 1 element.
In the first step the maximum element would be removed,
while in the second step minimum element of the remaining array would be removed,
in the third step again the maximum and so on.
Continue this till the array contains only 1 element. And print that final element remaining in the array.*/

public class leftElement {
        public static void main (String[] args) {
            //code
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t != 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                int temp = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                if (n % 2 == 0)
                    System.out.println(arr[n / 2 - 1]);
                else {
                    System.out.println(arr[n / 2]);
                }
                t--;
            }

        }
}
