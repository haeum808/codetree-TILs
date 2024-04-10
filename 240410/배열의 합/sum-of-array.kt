import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    repeat(4) {
        println(sc.nextLine().trim().split(" ").map { it.toInt() }.sum())
    }
}