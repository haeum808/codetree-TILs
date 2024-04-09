import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val result = sc.nextLine().trim().split(" ").joinToString("").reversed()

    print(result)
}