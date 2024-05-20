import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (x1, x2, x3, x4) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val firstLine = x1..x2
    val secondLine = x3..x4

    if (x1 !in secondLine && x2 !in secondLine && x3 !in firstLine && x4 !in firstLine) {
         print("nonintersecting")
    } else {
         print("intersecting")
    }
}