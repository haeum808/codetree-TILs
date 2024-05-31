import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var result = 0
    val n = sc.nextInt()
    val k = sc.nextInt()

    val hashMap: HashMap<Int, Int> = hashMapOf()

    repeat(n) {
        val num = sc.nextInt()
        hashMap[it] = num
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if(hashMap[i]?.plus(hashMap[j]!!) == k) result++
        }
    }

    print(result)
}