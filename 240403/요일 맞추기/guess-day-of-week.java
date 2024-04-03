import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] arr = new int[]{0, 31,28, 31, 30, 31,30,31, 31, 30, 31, 30, 31};
        int count = 0;
        if (m2 > m1) {
            while(true) {
                if(m1 == m2 && d1 == d2) {
                    break;
                }
                d1++;
                count++;
                if(d1 > arr[m1]) {
                    m1++;
                    d1 = 1;
                }
            }
            if(count % 7 == 0) {
                System.out.println("Mon");
            } else if (count% 7 == 1) {
                System.out.println("Tue");
            } else if (count % 7 == 2) {
                System.out.println("Wed");
            } else if (count % 7 == 3) {
                System.out.println("Thu");
            } else if (count % 7 == 4) {
                System.out.println("Fri");
            } else if (count % 7 == 5) {
                System.out.println("Sat");
            } else{
                System.out.println("Sun");
            }
        }
        else if (m1 > m2) {
            while(true) {
                if(m1 == m2 && d1 == d2) {
                    break;
                }
                d1--;
                count++;
                if(d1 < 1) {
                    m1--;
                    d1 = arr[m1];
                }
            }
            if(count % 7 == 0) {
                System.out.println("Mon");
            } else if (count% 7 == 1) {
                System.out.println("Sun");
            } else if (count % 7 == 2) {
                System.out.println("Sat");
            } else if (count % 7 == 3) {
                System.out.println("Fri");
            } else if (count % 7 == 4) {
                System.out.println("Thu");
            } else if (count % 7 == 5) {
                System.out.println("Wed");
            } else{
                System.out.println("Tue");
            }
        }
        else {
            if (d2 > d1) {
                while (true) {
                    if (m1 == m2 && d1 == d2) {
                        break;
                    }
                    d1++;
                    count++;
                }
                if (count % 7 == 0) {
                    System.out.println("Mon");
                } else if (count % 7 == 1) {
                    System.out.println("Tue");
                } else if (count % 7 == 2) {
                    System.out.println("Wed");
                } else if (count % 7 == 3) {
                    System.out.println("Thu");
                } else if (count % 7 == 4) {
                    System.out.println("Fri");
                } else if (count % 7 == 5) {
                    System.out.println("Sat");
                } else {
                    System.out.println("Sun");
                }
            } else { //d1 > d2
                while (true) {
                    if (m1 == m2 && d1 == d2) {
                        break;
                    }
                    d2++;
                    count++;
                }
                if (count % 7 == 0) {
                    System.out.println("Mon");
                } else if (count % 7 == 1) {
                    System.out.println("Sun");
                } else if (count % 7 == 2) {
                    System.out.println("Sat");
                } else if (count % 7 == 3) {
                    System.out.println("Fri");
                } else if (count % 7 == 4) {
                    System.out.println("Thu");
                } else if (count % 7 == 5) {
                    System.out.println("Wed");
                } else {
                    System.out.println("Tue");
                }
            }
        }
    }
}