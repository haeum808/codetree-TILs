import java.util.Scanner

class Person(
    val height: Int,
    val weight: Int,
    val id: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val persons = List(n) { Person(sc.nextInt(), sc.nextInt(), it + 1) }

    persons.sortedWith(
        compareBy(
            { it.height },
            { -it.weight }
        )
    ).forEach {
        println("${it.height} ${it.weight} ${it.id}")
    }
}