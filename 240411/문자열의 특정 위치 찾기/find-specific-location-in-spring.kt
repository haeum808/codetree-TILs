import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next()
    val target = sc.next()

    val index = str.indexOf(target)

    if (index == -1) {
        print("No")
    } else {
        print(index)
    }
}