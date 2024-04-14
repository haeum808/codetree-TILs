import java.util.Scanner

class Integer(var value: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val n = Integer(sc.nextInt())
    val m = Integer(sc.nextInt())
    
    swap(n, m)
    
    print("${n.value} ${m.value}")
}

fun swap(n: Integer, m: Integer) {
    val temp = n.value
    n.value = m.value
    m.value = temp
}