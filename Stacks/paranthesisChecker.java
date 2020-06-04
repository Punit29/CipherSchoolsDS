package stacks;
import java.util.*;
import java.lang.*;
import java.io.*;


public class paranthesisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s =sc.nextLine();
            if(checkParanthesis(s)){
                System.out.println("balanced");
            }
            else{
                System.out.println("not balanced");
            }
        }
    }

    static boolean checkParanthesis(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (st.isEmpty()) return false;
                char ch = st.pop();
                if ((c == '}' && ch != '{') ||
                        (c == ')' && ch != '(') ||
                        (c == ']' && ch != '['))
                    return false;
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }
}
