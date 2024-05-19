import java.util.*;
public class Main {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void backTracking(int k,int n, int depth, int[] arr) {
        if(depth == n) {
            printArray(arr);
            return;
        }
        for(int i=1;i<=k;i++) {
            arr[depth] = i;
            backTracking(k,n,depth+1,arr);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[k];
        backTracking(k,n,0,arr);
    }
}