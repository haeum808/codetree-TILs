fun main() {
    for (i in 1..19) {
        for (j in 1..19) {
            if (j % 2 == 0 || j == 19) {
                println("$i * $j = ${i * j}")
            } else if (j % 2 != 0) {
                print("$i * $j = ${i * j} / ")
            } 
        }
    }
}