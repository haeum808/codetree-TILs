import java.util.Scanner;
public class Main {
    public static class agent {
        char code_name;
        int score;
        public agent() {
            this.code_name = 'A';
            this.score = 0;
        }
        public agent(char code_name, int score) {
            this.code_name = code_name;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        agent[] agent_arr = new agent[5];
        for(int i=0;i<5;i++) {
            agent_arr[i] = new agent();
        }
        for(int i=0;i<5;i++) {
            agent_arr[i].code_name = sc.next().charAt(0);
            agent_arr[i].score = sc.nextInt();
        }
        int min = agent_arr[0].score;
        int k=0;
        for(int i=1;i<5;i++) {
            if(agent_arr[i].score < min) {
                min = agent_arr[i].score;
                k = i;
            }
        }
        System.out.printf("%c ", agent_arr[k].code_name);
        System.out.printf("%d", agent_arr[k].score);
    }
}