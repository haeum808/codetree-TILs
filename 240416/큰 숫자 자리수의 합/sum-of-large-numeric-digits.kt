import java.util.Scanner

fun main() {
    val sc  = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    print(sum(a * b * c))
}

fun sum(n: Int): Int {
    if (n < 10) {
        return n
    }

    return (n % 10) + sum(n / 10) 
}