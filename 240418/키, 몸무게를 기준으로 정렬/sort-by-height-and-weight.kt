import java.util.Scanner

class Person(
    val name: String,
    val height: Int,
    val weight: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val persons = List(n) {
        Person(sc.next(), sc.nextInt(), sc.nextInt())
    }

    persons.sortedWith(
        compareBy(
            { it.height },
            { -it.weight }
        )
    ).forEach {
        println("${it.name} ${it.height} ${it.weight}")
    }
}