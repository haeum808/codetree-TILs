import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val m = sc.nextInt()

    if (m in 3..5) {
        print("Spring")
    } else if (m in 6..8) {
        print("Summer")
    } else if (m in 9..11) {
        print("Fall")
    } else if (m == 1 || m == 2 || m == 12) {
        print("Winter")
    }
}