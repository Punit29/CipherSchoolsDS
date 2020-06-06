package string;
import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/anagram/0
//Given two strings a and b consisting of lowercase characters.
//The task is to check whether two given strings are anagram of each other or not.
//An anagram of a string is another string that contains same characters, only the order of characters can be different.
//For example, “act” and “tac” are anagram of each other.
//
//Input:
//    The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.


public class anagram {
    public static void main (String[] args) {
        //code
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            int flag=0;
            if(a.length()==b.length()){
                int fa[]=new int[26];
                // int fb[]=new int[26];
                for(int i=0;i<a.length();i++){
                    int index =a.charAt(i)-'a';
                    fa[index]++;
                    index=b.charAt(i)-'a';
                    //fb[index]++;
                    fa[index]--;
                }

                for(int i=0;i<26;i++){
                    if(fa[i]!=0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}