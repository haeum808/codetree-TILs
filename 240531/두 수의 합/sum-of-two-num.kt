import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var result = 0
    val n = sc.nextInt()
    val k = sc.nextLong()

    val hashMap: HashMap<Long, Int> = hashMapOf()

    repeat(n) {
        val num = sc.nextLong()
        val complement = k - num
        result += hashMap.getOrDefault(complement, 0)
        hashMap[num] = hashMap.getOrDefault(num, 0) + 1
    }

    print(result)
}