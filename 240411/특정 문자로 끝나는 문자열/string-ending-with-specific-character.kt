import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val strs = mutableListOf<String>()

    while(true) {
        val input = sc.next()

        if (input.length == 1) {
            for (str in strs) {
                if (str.endsWith(input)) {
                    println(str)
                }
            }

            break
        }

        strs.add(input)
    }
    
}