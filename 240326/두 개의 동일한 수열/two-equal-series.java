import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        int k =0;
        for(k=0;k<n;k++) {
            if(arr1[k] != arr2[k]) {
                System.out.println("No");
                break;
            }
        }
        if(k==n)
            System.out.println("Yes");
    }
}