import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(11)

    while(true) {
        val num = sc.nextInt()

        if (num == 0) break

        arr[num / 10]++
    }

    for (index in 10 downTo 1) {
        println("${index * 10} - ${arr[index]}")
    }
}