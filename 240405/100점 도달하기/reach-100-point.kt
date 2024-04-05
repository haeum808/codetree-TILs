import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val score = sc.nextInt()

    for(i in score..100) {
        when(i) {
            in 90..100 -> print("A ")
            in 80..90 -> print("B ")
            in 70..80 -> print("C ")
            in 60..70 -> print("D ")
            else -> print("F ")
        }
    }
}