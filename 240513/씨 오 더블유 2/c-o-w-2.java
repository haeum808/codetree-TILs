import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;

        for(int i=0;i<n-2;i++) {
            if(arr[i] == 'C') {
                for(int j=i+1;j<n-1;j++) {
                    if(arr[j] == 'O') {
                        for(int k=j+1;k<n;k++) {
                            if(arr[k] == 'W')
                                count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}