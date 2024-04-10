import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    var arr = sc.nextLine().trim().split(" ").filter { it.toInt() % 2 == 0 }

    print(arr.joinToString(" "))
}