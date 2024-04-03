import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (math1, english1) = sc.nextLine().split(" ").map { it.toInt() }
    val (math2, english2) = sc.nextLine().split(" ").map { it.toInt() }

    if (math1 > math2 && english1 > english2) {
        println(1)
    } else {
        println(0)
    }
}