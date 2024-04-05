import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0

    val n = sc.nextInt()

    repeat(n) {
        val num = sc.nextInt()

        if (num % 3 == 0 && num % 2 != 0) sum += num
    }

    print(sum)
}