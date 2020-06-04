package stacks;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0
//Given a postfix expression, the task is to evaluate the expression and print the final value. Operators will only include the basic arithmetic operators like *,/,+ and - .
//
//        Input:
//        The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains an postfix expression.

public class postfixEval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            System.out.println(posteval(s));
        }
    }

    static int posteval(String s){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                st.push(c-'0');
            }
            else{
                int val2=st.pop();
                int val1=st.pop();
                int res = solve(c,val1,val2);
                st.push(res);
            }
        }
        return st.pop();
    }

    static int solve(char c,int val1,int val2){
        if(c=='*') return val1*val2;
        if(c=='+') return val1+val2;
        if(c=='-') return val1-val2;
        if(c=='/') return val1/val2;
        return 0;
    }
}
