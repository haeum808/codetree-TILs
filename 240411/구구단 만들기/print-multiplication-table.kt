import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in 1..9) {
        for (j in b downTo a) {
            if (j % 2 == 0 && j == a) {
                print("$j * $i = ${j * i}")
            } else if (j % 2 == 0) {
                print("$j * $i = ${j * i} / ")
            }
        }
        println()
    }
}