import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<n-2;i++) {
            for(int j=i+2;j<n;j++) {
                if(max < arr[i] + arr[j])
                    max = arr[i] + arr[j];
            }
        }
        
        System.out.println(max);
    }
}