import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var cnt1 = 0
    var cnt2 = 0

    repeat(10) {
        val number = sc.nextInt()

        if (number % 3 == 0) {
            cnt1++
        }
        if (number % 5 == 0) {
            cnt2++
        }
    }

    print("$cnt1 $cnt2")
}