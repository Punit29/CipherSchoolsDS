package string;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
//Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
//        Input:
//        The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.
//        Input:
//        2
//        i.like.this.program.very.much
//        pqr.mno
//        Output:
//        much.very.program.this.like.i
//        mno.pqr

public class reverse {
    public static void main (String[] args) {
        //code
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s[] = sc.next().split("\\.");
            //s[]=s.split(".");
            String a="";
            for(int i=s.length-1;i>=0;i--){
                a+=s[i]+".";
            }
            System.out.println(a.substring(0, a.length() - 1));
        }
    }
}