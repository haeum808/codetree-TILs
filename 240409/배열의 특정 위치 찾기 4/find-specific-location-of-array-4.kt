import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(10)
    var sum = 0
    var cnt = 0

    for (i in 0..9) {
        val num = sc.nextInt()

        if (num == 0) break

        if (num % 2 == 0) {
            sum += num
            cnt++
        }
    }

    print("$cnt $sum")
}