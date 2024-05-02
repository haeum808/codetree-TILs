import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var result = 0

    val n = sc.nextInt()
    val cows = IntArray(n) { sc.nextInt() }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                if (cows[i] <= cows[j] && cows[j] <= cows[k]) {
                    result++
                }
            }
        }
    }

    print(result)
}