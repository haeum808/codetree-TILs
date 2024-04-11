import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val strs = mutableListOf<String>()
    var cnt = 0
    var cnt2 = 0

    while(true) {
        val input = sc.next()

        if (cnt == 10) {
            for (str in strs) {
                if (str.endsWith(input)) {
                    println(str)
                    cnt2++
                }
            }

            break
        }

        strs.add(input)
        cnt++
    }

    if (cnt2 == 0) {
        print("None")
    }
    
}