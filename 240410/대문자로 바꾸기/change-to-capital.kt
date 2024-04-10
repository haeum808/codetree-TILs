import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val map = mapOf(
        "a" to "A", "b" to "B", "c" to "C", "d" to "D",
        "e" to "E", "f" to "F", "g" to "G", "h" to "H", "i" to "I",
        "j" to "J", "k" to "K", "l" to "L", "m" to "M",
        "n" to "N", "o" to "O", "p" to "P", "q" to "Q",
        "r" to "R", "s" to "S", "t" to "T", "u" to "U",
        "v" to "V", "w" to "W", "x" to "X", "y" to "Y",
        "z" to "Z"
    )

    repeat(5) {
        println(sc.nextLine().trim().split(" ").map { map[it] }.joinToString(" "))
    }
}