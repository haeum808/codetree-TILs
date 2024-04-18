import java.util.Scanner

class Agent(val codeName: String, val score: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val agents = List(5) { Agent(sc.next(), sc.nextInt()) }

    agents.minBy { it.score }.let {
        print("${it?.codeName} ${it?.score}")
    }
}