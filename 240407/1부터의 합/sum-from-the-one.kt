import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var sum = 0

    for (i in 1..100) {
        sum += i

        if (sum >= n) {
            print(i)
            break
        }
    }

}