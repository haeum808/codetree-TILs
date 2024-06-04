import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val t = sc.nextInt()

    val numbers = IntArray(n * 3) { sc.nextInt() }

    repeat(t) {
        val temp = numbers[n * 3 - 1]

        for (i in n * 3 - 1 downTo 1) {
            numbers[i] = numbers[i - 1]
        }

        numbers[0] = temp
    }

    for (i in 0 until n) {
        print("${numbers[i]} ")
    }
    println()
    for (i in n until n * 2) {
        print("${numbers[i]} ")
    }
    println()
    for (i in n * 2 until n * 3) {
        print("${numbers[i]} ")
    }
}