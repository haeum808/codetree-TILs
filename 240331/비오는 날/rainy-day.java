import java.time.LocalDate;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static class rainy_day {
        String date;
        String day;
        String weather;
        public rainy_day() {
            this.date = "2021-01-01";
            this.day = "Monday";
            this.weather = "Sun";
        }
        public rainy_day(String date, String day, String weather){
            this.date = date;
            this.day = day;
            this.weather = weather;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rainy_day[] days = new rainy_day[n];
        for(int i=0;i<n;i++) {
            days[i] = new rainy_day();
        }
        for(int i=0;i<n;i++) {
            days[i].date = sc.next();
            days[i].day = sc.next();
            days[i].weather = sc.next();
        }
        Arrays.sort(days, new Comparator<rainy_day>() {
            @Override
            public int compare(rainy_day o1, rainy_day o2) {
                return LocalDate.parse(o1.date).compareTo(LocalDate.parse(o2.date));
            }
        });
        int k = 0;

        for(int i=0;i<n;i++) {
            if(days[i].weather.equals("Rain")) {
                k = i;
                break;
            }
        }
        System.out.println(days[k].date + " " + days[k].day + " " + days[k].weather);
    }
}