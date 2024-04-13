import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    
    var sum = 0

    for (i in a..b) {
        if (isPrime(i)) {
            sum += i
        }
    }

    print(sum)
}

fun isPrime(number : Int): Boolean {
    for (i in 2..number - 1) {
        if (number % i == 0) return false
    }
    return true
}