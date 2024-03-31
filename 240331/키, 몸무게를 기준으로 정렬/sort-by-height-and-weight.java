import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static class Person implements Comparable<Person>{
        String name;
        int height;
        int weight;
        public Person() {
            this.name = "";
            this.height = 0;
            this.weight = 0;
        }
        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(Person person) {
            if(this.height == person.height)
                return person.weight - this.weight;
            return this.height - person.height;
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
        for(int i=0;i<n;i++) {
            people[i].name = sc.next();
            people[i].height = sc.nextInt();
            people[i].weight = sc.nextInt();
        }
        Arrays.sort(people);
        for(int i=0;i<n;i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}