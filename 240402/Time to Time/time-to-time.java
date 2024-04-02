import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();
        int time = 0;
        if(minute2 > minute1) {
            hour2--;
            minute2 += 60;
            time = (hour2 - hour1)*60 + (minute2 - minute1);
            System.out.println(time);
        }
        else {
            time = (hour2 - hour1)*60 + (minute2 - minute1);
            System.out.println(time);
        }
    }
}