import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (math1, english1) = sc.nextLine().split(" ").map { it.toInt() }
    val (math2, english2) = sc.nextLine().split(" ").map { it.toInt() }

    if (math1 > math2) {
        print("A")
    } else if (math2 > math1) {
        print("B")
    } else {
        if (english1 > english2) {
            print("A")
        } else {
            print("B")
        }
    }
}