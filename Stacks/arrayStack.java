package stacks;
import java.util.*;
import java.lang.*;
import java.io.*;

class myStack{
    final int size=10;
    int arr[]=new int[size];
    int top=-1;
    boolean empty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    int peek(){
        if(this.empty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void push(int data){
        if(top==9){
            System.out.println("Stack full");
            return;
        }
        arr[++top]=data;
    }

    int pop(){
//        int temp=arr[top];
//        top--;
//        return temp;
        //if(top==-1)
        if(this.empty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }
}

public class arrayStack {
    public static void main(String[] args) {
        myStack s =new myStack();
        System.out.println(s.empty());
        s.push(1);
        s.push(15);
        s.push(9);
        s.push(8);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
