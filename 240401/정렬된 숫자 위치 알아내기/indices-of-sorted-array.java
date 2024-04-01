import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static class Arr implements Comparable<Arr>{
        int x;
        int y;
        public Arr() {
            this.x = 0;
            this.y = 0;
        }
        public Arr(int x, int y) {
            this.x =x;
            this.y=y;
        }
        @Override
        public int compareTo(Arr arr) {
            return this.x - arr.x;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arr[] arr1 = new Arr[n];
        Arr[] arr2 = new Arr[n];
        for(int i=0;i<n;i++) {
            arr1[i] = new Arr();
            arr2[i] = new Arr();
        }
        for(int i=0;i<n;i++) {
            arr1[i].x = sc.nextInt();
            arr2[i].x = arr1[i].x;
        }
        Arrays.sort(arr1);
        for(int i=0;i<n;i++) {
            arr1[i].y = i+1;
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr1[j].x == arr2[i].x) {
                    arr1[j].x =0;
                    System.out.print(arr1[j].y+ " ");
                    break;
                }
            }
        }
    }
}