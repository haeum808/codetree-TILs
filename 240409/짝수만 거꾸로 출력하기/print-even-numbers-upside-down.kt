import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = IntArray(n)

    for (i in 0..n - 1) {
        arr[i] = sc.nextInt()
    }

    arr.reversed().forEach { if(it % 2== 0) print("$it ") }
}