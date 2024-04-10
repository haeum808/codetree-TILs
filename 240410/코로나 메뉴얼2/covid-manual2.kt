import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(4)

    repeat(3) {
        val (a, b) = sc.nextLine().trim().split(" ")

        if (a == "Y" && b.toInt() >= 37) arr[0]++
        else if (b.toInt() >= 37) arr[1]++
        else if (a == "Y") arr[2]++
        else arr[3]++
    }

    print(arr.joinToString(" "))

    if (arr[0] >= 2) print(" E")
}