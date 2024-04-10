import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(10)

    while(true) {
        val num = sc.nextInt()

        if (num == 0) break

        arr[num / 10]++
    }

    arr.forEachIndexed { index, value ->
        if (index != 0) println("${index} - $value")
    }
}