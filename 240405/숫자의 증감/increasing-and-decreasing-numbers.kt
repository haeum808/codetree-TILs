import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (c, n) = sc.nextLine().trim().split(" ")

    if (c == "A") {
        for (i in 1..n.toInt()) {
            print("$i ")
        }
    } else {
        for (i in n.toInt() downTo 1) {
            print("$i ")
        }
    }
}