import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static class Person implements Comparable<Person> {
        String name;
        int height;
        double weight;
        public Person() {
            this.name = "";
            this.height = 0;
            this.weight = 0.0;
        }
        public Person(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        
        @Override
        public int compareTo(Person person) {
            return person.height - this.height;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        for(int i=0;i<5;i++) {
            people[i] = new Person();
        }

        for(int i=0;i<5;i++) {
            people[i].name = sc.next();
            people[i].height = sc.nextInt();
            people[i].weight = sc.nextDouble();
        }
        Arrays.sort(people, (a,b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i=0;i<5;i++){
            System.out.println(people[i].name + " " + people[i].height + " "+ people[i].weight);
        }
        System.out.println();
        Arrays.sort(people);
        System.out.println("height");
        for(int i=0;i<5;i++){
            System.out.println(people[i].name + " " + people[i].height + " "+ people[i].weight);
        }
    }
}