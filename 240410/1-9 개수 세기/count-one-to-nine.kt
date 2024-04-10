import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(9)

    val n = sc.nextInt()
    sc.nextLine()

    repeat(n) {
        arr[sc.nextInt() - 1]++
    }

    print(arr.joinToString("\n"))
}