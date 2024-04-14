import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[2001];
        for(int i=0;i<2001;i++) {
            arr[i] = 0;
        }
        int start = 1000;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir =='R') {
                for(int j=start; j<Math.min(start+x, 2000); j++) { // 배열 범위를 초과하지 않도록 수정
                     arr[j]++;
                }
                start = Math.min(start + x, 2000); // start 위치 업데이트 시 배열 범위를 초과하지 않도록 수정
            } else {
                for(int j=start; j>Math.max(start-x, 0); j--) { // 배열 범위를 초과하지 않도록 수정
                    arr[j]++;
                }
                start = Math.max(start - x, 0); // start 위치 업데이트 시 배열 범위를 초과하지 않도록 수정
            }
        }
        int count = 0;
        for(int i=0;i<2001;i++) {
            if(arr[i] >=2)
                count++;
        }
        System.out.println(count);
    }
}