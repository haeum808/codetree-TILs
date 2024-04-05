import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        if (i.toString().any { it == '3' || it == '6' || it == '9'} || i % 3 == 0) {
            print("0 ")
        }
        else {
            print("$i ")
        }
    }
}