import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

     val a = sc.nextInt()
     val b = sc.nextInt()
     var cnt = 0

     for (i in a..b) {
        if (isMagicNumber(i)) cnt++
     }

     print(cnt)
}

fun isMagicNumber(i: Int): Boolean {
    if (i % 3 == 0 || contains369(i)) {
        return true
    } else {
        return false
    }
}

fun contains369(i: Int): Boolean {
    if ("$i".any { it == '3' || it == '6' || it == '9' }) {
        return true
    } else {
        return false
    }
}