import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static class Student implements Comparable<Student> {
        int height;
        int weight;
        int index;
        public Student() {
            this.height = 0;
            this.weight = 0;
            this.index= 0;
        }
        public Student(int height, int weight, int index) {
            this.height = height;
            this.weight = weight;
            this.index = index;
        }
        @Override
        public int compareTo(Student student) {
            if (this.height == student.height) {
                return this.weight - student.weight;
            }
            return this.height - student.height;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++) {
            students[i] = new Student();
        }
        for(int i=0;i<n;i++) {
            students[i].height = sc.nextInt();
            students[i].weight = sc.nextInt();
            students[i].index = i + 1;
        }
        Arrays.sort(students);
        for(int i=0;i<n;i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].index);
        }
    }
}