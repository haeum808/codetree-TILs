import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0
    var cnt = 0

    while(true) {
        val age = sc.nextInt()

        if (age !in 20..29) break
        
        sum += age
        cnt++
    }

    print("%.2f".format(sum / cnt.toDouble()))
}