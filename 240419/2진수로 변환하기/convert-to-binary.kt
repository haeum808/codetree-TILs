import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var cnt = 0
    var result = ""

    while(true) {
        result += n % 2

        if (n < 2) {
            break
        }

        n /= 2
    }

    print(result.reversed())
}