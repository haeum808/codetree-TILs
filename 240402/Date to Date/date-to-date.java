import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int month1 = sc.nextInt();
        int day1 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        int elapsedDate = 1;
        
        int dateArr[] = new int[]{0,31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = dateArr[month1];
        while(true) {
            if(day1 == day2 && month1 == month2) 
                break;
            
            elapsedDate++;
            day1++;
            if(day1 > dateArr[month1]) {
                month1++;
                day1 = 1;
            }
            
        }
        System.out.println(elapsedDate);
    }
}