import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var cnt = 0

    while(true) {
        if (n >= 1000) break

        if (n % 2 == 0) {
            n = n * 3 + 1
        } else {
            n = n * 2 + 2
        }

        cnt++
    }

    print(cnt)
}