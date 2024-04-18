import java.util.Scanner

class Student(
    val name: String,
    val kor: Int,
    val eng: Int,
    val math: Int
): Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return (kor + eng + math) - (other.kor + other.eng + other.math)
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val students = List(n) {
        Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt())
    }

    students.sorted().forEach {
        println("${it.name} ${it.kor} ${it.eng} ${it.math}")
    }
}