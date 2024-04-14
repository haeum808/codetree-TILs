import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    var cnt = 0
    
    for (i in a..b) {
        if (onjeonsu(i)) cnt++
    }

    print(cnt)
}

fun onjeonsu(num: Int): Boolean {
    return num % 2 != 0 && num % 10 != 5 && !(num % 3 == 0 && num % 9 != 0)
}