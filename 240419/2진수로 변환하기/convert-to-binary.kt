import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var cnt = 0
    val arr = IntArray(20)

    while(true) {
        arr[cnt++] = n % 2

        if (n < 2) {
            break
        }

        n /= 2
    }

    print(arr.reversed().joinToString("").toInt())
}