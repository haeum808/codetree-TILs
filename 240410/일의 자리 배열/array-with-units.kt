import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (pp, p) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    print("$pp $p ")
    for (i in 3..10) {
        var temp = (p + pp) % 10
        pp = p
        p = temp

        print("$p ")
    }
}