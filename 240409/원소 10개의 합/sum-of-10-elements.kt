import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val sum = sc.nextLine().trim().split(" ").map { it.toInt() }.sum()

    print(sum)
}