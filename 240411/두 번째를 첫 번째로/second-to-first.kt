import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next().toCharArray()
    val target1 = str[0]
    val target2 = str[1]

    for (index in str.indices) {
        if (str[index] == target2) {
            str[index] = target1
        }
    }

    print(str.joinToString(""))
}