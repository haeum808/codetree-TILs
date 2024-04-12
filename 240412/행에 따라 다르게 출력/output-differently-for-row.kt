import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var num = 0

    for (i in 1..n) {

        if (i % 2 != 0){
            for (j in 1..n) {
                print("${num + j} ")
            }
            num += n + 2
        } else {
            for (j in 1..n) {
                print("$num ")
                num += 2
            }
            num -= 2
        }
        println()
    }   
}