import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in 2..8 step 2) {
        for (j in b downTo a) {
            if (j == a) {
                print("$j * $i = ${j * i}")
            } else {
                print("$j * $i = ${j * i} / ")
            }
        }
        println()
    }
}