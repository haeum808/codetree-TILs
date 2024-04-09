import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    val average = sc.nextLine().trim().split(" ").map { it.toDouble() }.sum() / n

    println("%.1f".format(average))
    if(average >= 4.0) print("Perfect")
    else if (average >= 3.0) print("Good")
    else print("Poor")
}