import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0
    var cnt = 0

    for(i in 1..10) {
        val num = sc.nextInt()

        if (num == 0) break

        sum += num
        cnt++
    }

    print("${sum} ${"%.1f".format(sum / cnt.toDouble())}")
}