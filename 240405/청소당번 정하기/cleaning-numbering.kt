import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt1 = 0
    var cnt2 = 0
    var cnt3 = 0

    val n = sc.nextInt()

    for (i in 1..n) {
        if (i % 12 == 0) cnt3++
        else if (i % 3 == 0) cnt2++
        else if (i % 2 == 0) cnt1++
    }

    print("$cnt1 $cnt2 $cnt3")
}