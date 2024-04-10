import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (n, q) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    repeat(q) {
        val qs = sc.nextLine().trim().split(" ").map { it.toInt() }

        if (qs[0] == 1) {
            println(numbers[qs[1] - 1])
        } else if (qs[0] == 2) {
            val result = numbers.indexOf(qs[1])
            if (result == -1) {
                println(0)
            } else {
                println(result + 1)
            }
        } else {
            println(numbers.slice(qs[1] - 1..qs[2] - 1).joinToString(" "))
        }
    }
}