import java.util.Scanner

class Person(
    val name: String,
    val postalCode: String,
    val region: String
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val persons = List(n) { Person(sc.next(), sc.next(), sc.next()) }

    persons.maxBy { it.name }.let {
        println("name ${it?.name}")
        println("addr ${it?.postalCode}")
        println("city ${it?.region}")
    }
}