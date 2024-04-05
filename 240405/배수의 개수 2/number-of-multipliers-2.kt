import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var cnt = 0

    repeat(10) {
        if(sc.nextInt() % 2 !=0) cnt++ 
    }
    
    print(cnt)
}