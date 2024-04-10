import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = arrayOf('L', 'E', 'B', 'R', 'O', 'S')
    val result = arr.indexOf(sc.next()[0])

    if (result == -1) {
        print("None")
    } else {
        print(result)
    }
}