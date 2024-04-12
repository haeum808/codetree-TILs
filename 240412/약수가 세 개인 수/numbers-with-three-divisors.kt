import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val start = sc.nextInt()
    val end = sc.nextInt()

    var result = 0

    for (i in start..end) {
        var cnt = 0

        for (j in 1..i) {
            if (i % j == 0) cnt++
        }

        if (cnt == 3) result++
    }

    print(result)
}