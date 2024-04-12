import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val start = sc.nextInt()
    val end = sc.nextInt()
    var cnt = 0

    for (i in start..end) {
        var sum = 0

        for (j in 1..i - 1) {
            if (i % j == 0) {
                sum += j
            }
        }

        if (sum == i) {
            cnt++
        }
    }

    print(cnt)
}