import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void Print() {
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }

    public static void choose(int currNum) {
        if (currNum == n + 1) {
            Print();
            return;
        }
        for (int i = 1; i <= k; i++) {
            if (answer.size() >= 2) {
                if (answer.get(answer.size() - 1) == i && answer.get(answer.size() - 2) == i) {
                    continue; 
                }
            }
            answer.add(i);
            choose(currNum + 1);
            answer.remove(answer.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);
    }
}