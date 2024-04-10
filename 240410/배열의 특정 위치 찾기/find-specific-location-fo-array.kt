import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }

    val sum = arr.filterIndexed { index, _ -> index % 2 != 0 }.sum()
    val average = (arr[2] + arr[5] + arr[8]) / 3.0

    print("$sum ${"%.1f".format(average)}")
}