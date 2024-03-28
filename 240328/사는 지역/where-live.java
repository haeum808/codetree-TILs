import java.util.Scanner;
public class Main {
    public static class Region{
        String name;
        String addr;
        String city;
        public Region() {
            this.name = "kim";
            this.addr = "addr";
            this.city = "seoul";
        }

        public Region(String name, String addr, String city) {
            this.name = name;
            this.addr = addr;
            this.city = city;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Region[] regions = new Region[n];
        for(int i=0;i<n;i++) {
            regions[i] = new Region();
        }
        for(int i=0;i<n;i++) {
            regions[i].name = sc.next();
            regions[i].addr = sc.next();
            regions[i].city = sc.next();
        }
        System.out.printf("name %s\n", regions[n-1].name);
        System.out.printf("addr %s\n", regions[n-1].addr);
        System.out.printf("city %s", regions[n-1].city);
    }
}