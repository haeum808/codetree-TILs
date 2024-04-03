import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a1, b1) = sc.nextLine().split(" ")
    val (a2, b2) = sc.nextLine().split(" ")
    val (a3, b3) = sc.nextLine().split(" ")

    var count = 0

    if (a1 == "Y" && b1.toInt() >= 37) count += 1
    if (a2 == "Y" && b2.toInt() >= 37) count += 1
    if (a3 == "Y" && b3.toInt() >= 37) count += 1

    if (count >= 2) {
        print("E")
    } else {
        print("N")
    }
}