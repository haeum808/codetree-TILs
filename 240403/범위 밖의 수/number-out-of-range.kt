import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    if (a < 10 || a > 20) {
        print("yes")
    } else {
        print("no")
    }
}