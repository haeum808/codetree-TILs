import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(arr[0] == ')') {
            System.out.println("No");
            return;
        }
        for (char c : arr) {
            if (c == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}