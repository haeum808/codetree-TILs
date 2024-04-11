import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }.sorted()

    var min = numbers.min()!!

    for (number in numbers) {
        if (number > min) {
            min = number

            if (numbers.indexOf(min) == numbers.lastIndexOf(min)) {
                print(numbers.indexOf(min) + 1)
            } else {
                print(-1)
            }
            return
        }
    }

    print(-1)
}