import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    star(n)
}

fun star(n: Int) {
    if (n == 0) return

    repeat(n) {
        print("* ")
    }
    println()
    star(n - 1)
    repeat(n) {
        print("* ")
    }
    println()
}