import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    if (a % 3 == 0 || a % 5 == 0) {
        print(1)
    } else {
        print(0)
    }
}