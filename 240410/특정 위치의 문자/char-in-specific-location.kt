import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = arrayOf('L', 'E', 'B', 'R', 'O', 'S')

    print("${arr.indexOf(sc.next()[0]) ?: "None"}")
}