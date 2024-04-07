import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 0

    while(cnt != 3) {
        val number = sc.nextInt()

        if (number % 2 == 0) {
            println(number / 2)
            cnt++
        }
    }
}