import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[2000];
        for(int i=0;i<2000;i++) {
            arr[i] = 0;
        }
        int start = 1000;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir =='R') {
                for(int j=start+1;j<start+x;j++) {
                    arr[j]++;
                }
                start += x;
            }
            else {
                for(int j=start-1;j>start-x;j--) {
                    arr[j]++;
                }
                start -= x;
            }
        }
        int count = 0;
        for(int i=0;i<2000;i++) {
            if(arr[i] >=2)
                count++;
        }
        System.out.println(count);
    }
}