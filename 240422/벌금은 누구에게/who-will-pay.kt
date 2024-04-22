import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = sc.nextInt()

    val students = IntArray(n + 1)

    for(i in 1..m) {
        val fault = sc.nextInt()

        students[fault]++

        if (students[fault] == k) {
            print(fault)
            return
        }
    }

    print(-1)
}