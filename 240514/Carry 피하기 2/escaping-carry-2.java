import java.util.*;

public class Main {
    public static boolean checkSum(int a, int b, int c) {
        while(a >0 || b>0 ||c >0) {
            int carry = (a%10) + (b%10) + (c%10);
            if(carry > 9) {
                return false;
            } else {
                a /= 10;
                b /= 10;
                c /= 10;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        int ans = -1;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        boolean check = false;
        for(int i=0;i<n-2;i++) {
            if(check == true)
                break;
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    if(checkSum(arr[i],arr[j],arr[k])) {
                        ans = arr[i] + arr[j] + arr[k];
                        check = true;
                    }            
                }
            }
        }
        System.out.println(ans);
    }
}