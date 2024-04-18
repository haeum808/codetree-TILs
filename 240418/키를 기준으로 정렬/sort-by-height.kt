import java.util.Scanner

class Person(
    val name: String,
    val height: Int,
    val weight: Int
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return height - other.height
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val persons = List(n) {
        Person(sc.next(), sc.nextInt(), sc.nextInt())
    }

    persons.sorted().forEach {
        println("${it.name} ${it.height} ${it.weight}")
    }
}