import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int len = str.length();
        int count = 0;
        for(int i=0;i<len-3;i++){
            if(arr[i] == '(' && arr[i+1] == '('){
                for(int j=i+2;j<len-1;j++) {
                    if(arr[j]==')' && arr[j+1]==')')
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}