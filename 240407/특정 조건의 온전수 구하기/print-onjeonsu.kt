import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        if (i % 2 == 0 || i % 5 == 0 || (i % 3 == 0 && i % 9 != 0)) continue

        print("$i ")
    }
}