import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    if (b > a && b < c) {
        print(1)
    } else {
        print(0)
    }
}