import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()

    print("%.2f".format(a + b))
}