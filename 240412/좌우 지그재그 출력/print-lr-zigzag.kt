import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var num = 1

    for (i in 1..n) {

        if (i % 2 != 0){
            for (j in 1..n) {
                print("${num++} ")
            }
        } else {
            num = (num - 1) * 2
            for (j in 1..n) {
                print("${num + 1 - j} ")
            }
            num++
        }
        println()
    }   
}