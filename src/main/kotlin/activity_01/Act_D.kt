package activity_01

fun main(){
    print("Enter 5 monetary amount : \n")
    var cash1:Int? = null
    cash1 = readln().toInt()
    var cash2:Int? = null
    cash2 = readln().toInt()
    var cash3:Int? = null
    cash3 = readln().toInt()
    var cash4:Int? = null
    cash4 = readln().toInt()
    var cash5:Int? = null
    cash5 = readln().toInt()



    var total = cash1 + cash2 + cash3 + cash4 + cash5
    println("Total of the 5 monetary value: $total")

    println("Divide the value by how many? : ")
    var divisor = 0.00f
    divisor = readln().toFloat()

    println("RESULT : ${total/divisor}")




}