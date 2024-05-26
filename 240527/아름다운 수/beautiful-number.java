import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> results = new ArrayList<>();
        generateNumbers(results, 0, n);
        int count = 0;
        String str1 = "1";
        String str2 = "22";
        String str3 = "333";
        String str4 = "4444";
        for (int i = 0; i < results.size(); i++) {
            Integer integer = results.get(i);
            String str = integer.toString();
            while (str.length() > 0) {
                if (str.startsWith(str4)) {
                    str = str.substring(4);
                } else if (str.startsWith(str3)) {
                    str = str.substring(3);
                } else if (str.startsWith(str2)) {
                    str = str.substring(2);
                } else if (str.startsWith(str1)) {
                    str = str.substring(1);
                } else {
                    break;
                }
            }
            if (str.length() == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void generateNumbers(List<Integer> list, int currentNumber, int length) {
        if (length == 0) {
            list.add(currentNumber);
            return;
        }
        for (int i = 1; i <= 4; i++) {
            generateNumbers(list, currentNumber * 10 + i, length - 1);
        }
    }
}