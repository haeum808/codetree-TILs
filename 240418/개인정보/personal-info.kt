import java.util.Scanner

class Person(
    val name: String,
    val height: Int,
    val weight: Double
)

fun main() {
    val sc = Scanner(System.`in`)

    val persons = List(5) {
        Person(sc.next(), sc.nextInt(), sc.nextDouble())
    }

    println("name")
    persons.sortedBy { it.name }.forEach {
        println("${it.name} ${it.height} ${it.weight}")
    }
    println()
    println("height")
    persons.sortedBy { -it.height }.forEach {
        println("${it.name} ${it.height} ${it.weight}")
    }
}