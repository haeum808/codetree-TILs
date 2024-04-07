import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 0
    var n = sc.nextInt()

    while(true) {
        if (n == 1) break

        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
        cnt++
    }

    print(cnt)
}