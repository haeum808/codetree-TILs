import java.util.Scanner

class Person(
    val height: Int,
    val weight: Int,
    val number: Int
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return if (height == other.height) {
            if (weight == other.weight) {
                number - other.number
            } else {
                other.weight - weight
            }
        } else {
            other.height - height
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val persons = List(n) {
        Person(sc.nextInt(), sc.nextInt(), it + 1)
    }

    persons.sorted().forEach {
        println("${it.height} ${it.weight} ${it.number}")
    }
}