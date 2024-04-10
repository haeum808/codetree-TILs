import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (index in numbers.indices) {
        if (numbers[index] == 0) {
            print(numbers[index - 1] + numbers[index - 2] + numbers[index - 3])
            break
        }
    }
}