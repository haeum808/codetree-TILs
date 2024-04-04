import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String date = sc.next();
        int[] count = new int[] {0,0,0,0,0,0,0};
        int[] arr = new int[]{0, 31,29, 31, 30,31,30,31,31,30,31,30,31};
        while(true) {
            if(m1 == m2 && d1 == d2) 
                break;
            count[d1%7]++;
            d1++;
            if(d1 > arr[m1]) {
                d1 = 1;
                m1++;
            }
        }
        if(date.equals("Mon")) {
            System.out.println(count[0]);
        } else if(date.equals("Tue")) {
            System.out.println(count[1]);
        } else if(date.equals("Wed")) {
            System.out.println(count[2]);
        } else if(date.equals("Thu")) {
            System.out.println(count[3]);
        } else if(date.equals("Fri")) {
            System.out.println(count[4]);
        } else if(date.equals("Sat")) {
            System.out.println(count[5]);
        } else {
            System.out.println(count[6]);
        }
         
    }
}