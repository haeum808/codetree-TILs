import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    if (a > b) {
        println(a * b)
    } else {
        println(b / a)
    }
}