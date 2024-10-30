import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++) {
            queue.add(i+1);
        }
        int index = 1;
        List<Integer> answer = new ArrayList<>();
        while(!queue.isEmpty()) {
            if(index==k) {
                answer.add(queue.poll());
                if(answer.size()==n) {
                    break;
                }
                index = 1;
            }
            queue.add(queue.poll());
            index++;
        }
        for(int i=0;i<answer.size();i++) {
            System.out.print(answer.get(i)+ " ");
        }
    }
}