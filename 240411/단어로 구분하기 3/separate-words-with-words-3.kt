import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var arr = Array(10) { "" }

    repeat(10) {
        arr[it] = sc.next()
    }

    print(arr.reversed().joinToString("\n"))
}