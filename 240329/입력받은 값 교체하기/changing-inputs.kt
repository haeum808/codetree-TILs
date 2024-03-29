import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    val temp = a
    a = b
    b = temp

    print("$a $b")
}