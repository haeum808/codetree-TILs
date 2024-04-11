import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var sum = 0
    var countA = 0

    val n = sc.nextInt()

    while(sc.hasNext()) {
        val str = sc.next()

        sum += str.length
        
        if (str[0] == 'a') countA++
    }

    print("$sum $countA")
}