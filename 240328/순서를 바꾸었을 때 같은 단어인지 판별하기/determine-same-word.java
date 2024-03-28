import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int k = 0;
        for(int i=0;i<str1.length();i++) {
            if(ch1[i]!=ch2[i]){
                System.out.println("No");
                break;
            } else {
                k++;
            }
        }
        if(k == str1.length()) {
            System.out.println("Yes");
        }
    }
}