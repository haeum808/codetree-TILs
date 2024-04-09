import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10)
    var sum = 0
    var cnt = 0

    for(i in 0..9) {
        arr[i] = sc.nextInt()
    }

    for (num in arr) {
        if (num >= 250) break

        sum += num
        cnt++
    }

    print("${sum} ${sum / cnt.toDouble()}")
}