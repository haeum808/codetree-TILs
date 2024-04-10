import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }
    var cnt = 0

    for (index in numbers.indices) {
        if (numbers[index] == 2) cnt++

        if (cnt == 3) {
            print("${index + 1}")
            break
        }
    }
}