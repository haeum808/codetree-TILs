import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val strings = listOf("apple", "banana", "grape", "blueberry", "orange")

    val input = sc.next()[0]
    var cnt = 0

    for (i in strings.indices) {
        for (j in strings[i].indices) { 
            if (strings[i][j] == 'a' && (j == 2 || j == 3)) {
                println(strings[i])
                cnt++
                break
            }
        }
    }
    println(cnt)
}