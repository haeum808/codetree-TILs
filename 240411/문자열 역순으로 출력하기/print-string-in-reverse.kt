import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = Array(4) { "" }

    repeat(4) {
        arr[it] = sc.next()
    }

    print(arr.reversed().joinToString("\n"))
}