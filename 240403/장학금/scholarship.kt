import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (mid, last) = sc.nextLine().split(" ").map { it.toInt() }

    if (mid >= 90) {
        if (last >= 95) {
            print(100000)
        } else if (last >= 90) {
            print(50000)
        } else {
            print(0)
        }
    } else {
        print(0)
    }
}