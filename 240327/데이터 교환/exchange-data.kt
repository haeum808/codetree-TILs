fun main() {
    var a = 5
    var b = 6
    var c = 7
    
    val temp1 = b
    val temp2 = c
    b = a
    c = temp1
    a = temp2

    println(a)
    println(b)
    print(c)
}