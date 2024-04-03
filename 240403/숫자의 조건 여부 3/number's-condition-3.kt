import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    if (a % 13 == 0 || a % 19 == 0) {
        print("True")
    } else {
        print("False")
    }
}