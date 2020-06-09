package string;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places/0
//Given two strings a and b. The task is to find if a string 'a' can be obtained by rotating another string 'b' by 2 places.
//        Input:
//        The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. In the next two line are two string a and b.
//        Input:
//        2
//        amazon
//        azonam
//        geeksforgeeks
//        geeksgeeksfor
//        Output:
//        1
//        0

public class checkIfRotated {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            int n1=s1.length();
            int n2 =s2.length();
            if(n1==n2) {
                String clock = "";
                String anticlock = "";
                int len = s2.length();

                anticlock= anticlock + s2.substring(len-2, len) + s2.substring(0, len-2) ;

                clock = clock + s2.substring(2) + s2.substring(0, 2) ;
                if(s1.equals(clock) || s1.equals(anticlock)){
                    System.out.println("1");}
                else{
                    System.out.println("0");}
            }
            else {
                System.out.println("0");
            }
        }
    }
}