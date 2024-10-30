import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == '(') {
                stack.push('(');
            } else {
                if(stack.peek() == '(') {
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