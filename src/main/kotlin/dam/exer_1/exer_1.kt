package dam.exer_1

//Exercise 1 - Create and initialize an integer array with the first 50 perfect squares dynamically

fun main (){
    //a) Using IntArray constructor
    val squares_a= IntArray(50,  { it -> (it+1) * (it+1) })
    //println(squares_a[49])

    //b) Using a range and map()
    val keys= 1..50
    val squares_b= keys.map { it -> it * it }
    //println(squares_b)

    //c) Using Array with constructor
    val squares_c= Array(50, {it -> (it+1) * (it+1)})
    //println(squares_c[49])
}