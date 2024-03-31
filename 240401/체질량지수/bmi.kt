import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val h = sc.nextInt()
    val w = sc.nextInt()

    val bmi = (10_000 * w) / (h * h)
    println(bmi)
    if (bmi >= 25) {
        println("Obesity")
    }
}