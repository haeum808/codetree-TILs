import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextDouble()
    val b = sc.nextDouble()

    print("${(a + b).toInt()} ${"%.1f".format((a + b) / 2)}")
}