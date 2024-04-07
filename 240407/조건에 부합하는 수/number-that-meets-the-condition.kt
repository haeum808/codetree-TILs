import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    for (i in 1..a) {
        if ((i % 2 == 0 && i % 4 != 0) || (i / 8 % 2 == 0) || (i % 7 < 4)) continue

        print("$i ")
    }
}