import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var cnt1 = 1
    var cnt2 = n

    repeat(n * 2) {
        if (it % 2 == 0) {
            repeat(cnt2--) {
                print("* ")
            }
        } else {
            repeat(cnt1++) {
                print("* ")
            }
        }
        println()
    }
}