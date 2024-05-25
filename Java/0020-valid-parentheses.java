import java.util.Scanner;
import java.util.Stack;

class ValidParentheses { 
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if((s.length())%2 != 0) return false;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch =='{' || ch == '[')
                st.push(ch);
            else{
                if(st.empty() || (st.peek()=='(' && ch!=')') || 
                (st.peek()=='{' && ch!='}') || (st.peek()=='[' && ch!=']')){
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string parentheses: ");
        String s = sc.nextLine();
        System.out.println(obj.isValid(s));
        sc.close();
    }
}
