import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val vision = sc.nextDouble()

    if (vision >= 1.0) println("High")
    else if (vision >= 0.5) println("Middle")
    else println("Low")
}