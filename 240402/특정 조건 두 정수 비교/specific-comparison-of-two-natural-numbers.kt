import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    if (a < b) {
        print("1 ")
    } else {
        print("0 ")
    }

    if (a == b) {
        print("1")
    } else {
        print("0")
    }
}