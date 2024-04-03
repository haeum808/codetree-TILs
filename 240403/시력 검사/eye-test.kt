import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextDouble()
    val b = sc.nextDouble()

    if (a >= 1.0 && b >= 1.0) {
        println("High")
    } else if (a >= 0.5 && b >= 0.5) {
        println("Middle")
    } else {
        println("Low")
    }
}