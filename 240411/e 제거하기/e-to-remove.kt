import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next().toCharArray()
    var find = false

    for (index in str.indices) {
        if (!find && str[index] == 'e') {
            find = true
        } else {
            print(str[index])
        }
    }
}