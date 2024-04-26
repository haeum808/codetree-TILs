import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val primes = mutableListOf<Int>()

    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in a..b) {

        if (isPrime(i)) {
            primes.add(i)
        }
    }

    if (primes.isEmpty()) {
        print(-1)
    } else {
        println(primes.sum())
        println(primes[0])
    }
}

fun isPrime(num: Int): Boolean {
    if (num == 1) return false

    for (i in 2..num - 1) {
        if (num % i == 0) return false
    }

    return true
}