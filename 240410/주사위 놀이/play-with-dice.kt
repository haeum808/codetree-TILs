import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(6)

    repeat(10) {
        arr[sc.nextInt() - 1]++
    }

    arr.forEachIndexed { index, value ->
        println("${index + 1} - $value")
    }
}