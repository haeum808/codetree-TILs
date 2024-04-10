import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }

    val evenSum = arr.filterIndexed { index, _ -> index % 2 != 0 }.sum()
    val oddSum = arr.filterIndexed { index, _ -> index % 2 == 0 }.sum()

    print(max(evenSum, oddSum) - min(evenSum, oddSum))
}