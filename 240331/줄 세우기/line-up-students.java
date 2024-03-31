import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static class Person implements Comparable<Person>{
        int height;
        int weight;
        int index;
        public Person() {
            this.height = 0;
            this.weight = 0;
            this.index = 0;
        }
        public Person(int height, int weight, int index) {
            this.height = height;
            this.weight = weight;
            this.index = index;
        }
        @Override
        public int compareTo(Person person) {
            if(this.height == person.height)
                return person.weight - this.weight;
            return person.height - this.height;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for(int i=0;i<n;i++) {
            people[i] = new Person();
        }
        for(int i=0; i<n;i++) {
            people[i].height = sc.nextInt();
            people[i].weight = sc.nextInt();
            people[i].index = i + 1;
        }
        Arrays.sort(people);
        for(int i=0;i<n;i++) {
            System.out.println(people[i].height + " " +people[i].weight + " "+ people[i].index);
        }
    }
}