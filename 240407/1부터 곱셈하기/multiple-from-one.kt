import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var mul = 1
    val n = sc.nextInt()

    for (i in 1..100) {
        mul *= i

        if (mul >= n) {
            print(i)
            break
        }
    }
}