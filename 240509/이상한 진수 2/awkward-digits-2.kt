import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.next()

    if (n.contains('0')) {
        print(Integer.parseInt(n.replaceFirst('0', '1'), 2))
    } else {
        print(Integer.parseInt(n.replaceFirst('1', '0'), 2))
    }
}