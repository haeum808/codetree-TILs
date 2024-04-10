import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var pp = 1
    var p = sc.nextInt()

    print("$pp $p ")
    while(true) {
        val temp = pp + p
        pp = p
        p = temp

        print("$temp ")

        if (temp > 100) break
    }
}