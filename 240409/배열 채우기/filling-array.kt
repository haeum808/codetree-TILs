import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10)

    for(i in 0..9) {
        val number = sc.nextInt()

        if (number == 0) break

        arr[i] = number
    }

    for(i in 9 downTo 0) {
        if (arr[i] != 0) {
            print("${arr[i]} ")
        }
    }
}