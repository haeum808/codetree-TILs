import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    printSquare(n, m)
}

fun printSquare(n: Int, m: Int) {
    for(i in 1..n) {
        for (j in 1..m) {
            print("1")
        }
        println()
    }
}