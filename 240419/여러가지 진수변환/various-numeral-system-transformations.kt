import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    val b = sc.nextInt()

    var result = ""

    while(true) {
        result += n % b

        if (n < b) {
            break
        }

        n /= b
    }

    print(result.reversed())
}