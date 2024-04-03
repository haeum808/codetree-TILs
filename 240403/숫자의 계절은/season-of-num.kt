import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val m = sc.nextInt()

    if (3 <= m && m <= 5) {
        print("Spring")
    } else if (6 <= m && 8 <= m) {
        print("Summer")
    } else if (9 <= m && 11 <= m) {
        print("Fall")
    } else {
        print("Winter")
    }
}