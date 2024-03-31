import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if (n >= 80) {
        println("pass")
    } else {
        println("${80 - n} more score")
    }
}