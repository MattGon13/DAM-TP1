package dam.exer_2

//Exercise 2 - Create a console-based calculator that allows users to perform various operations

fun main() {
    var end= false
    while(!end){
        println()
        println("KOTLIN CALCULATOR")
        println()
        println("Commands:")
        println("+ -> Addition")
        println("- -> Subtraction")
        println("* -> Multiplication")
        println("/ -> Division")
        println("&& -> AND")
        println("|| -> OR")
        println("! -> NOT")
        println("shl -> Left shift")
        println("shr -> Right shift")
        println("end -> Exit")
        println()

        print("Enter operator: ")
        while(true){
            val input_1= readln()
            try{
                when(input_1){
                    "+" -> {
                        print("Enter first operand: ")
                        val first_number= input_double()
                        print("Enter second operand: ")
                        val second_number= input_double()
                        println(sum(first_number, second_number))
                    }
                    "-" -> {
                        print("Enter first operand: ")
                        val first_number= input_double()
                        print("Enter second operand: ")
                        val second_number= input_double()
                        println(sub(first_number, second_number))
                    }
                    "*" -> {
                        print("Enter first operand: ")
                        val first_number= input_double()
                        print("Enter second operand: ")
                        val second_number= input_double()
                        println(mult(first_number, second_number))
                    }
                    "/" -> {
                        print("Enter first operand: ")
                        val first_number= input_double()
                        print("Enter second operand: ")
                        val second_number= input_double()
                        println(divide(first_number, second_number))
                    }
                    "&&" -> {
                        print("Enter first operand: ")
                        val first_bool= input_bool()
                        print("Enter second operand: ")
                        val second_bool= input_bool()
                        println(and(first_bool, second_bool))
                    }
                    "||" -> {
                        print("Enter first operand: ")
                        val first_bool= input_bool()
                        print("Enter second operand: ")
                        val second_bool= input_bool()
                        println(or(first_bool, second_bool))
                    }
                    "!" -> {
                        print("Enter operand: ")
                        val bool= input_bool()
                        println(notBool(bool))
                    }
                    "shl" -> {
                        print("Enter first operand: ")
                        val first_number= input_number()
                        print("Enter second operand: ")
                        val second_number= input_number()
                        println(shiftLeft(first_number, second_number))
                    }
                    "shr" -> {
                        print("Enter first operand: ")
                        val first_number= input_number()
                        print("Enter second operand: ")
                        val second_number= input_number()
                        println(shiftRight(first_number, second_number))
                    }
                    "end" -> {
                        end= true
                    }
                    else -> throw IllegalArgumentException()
                }
                break
            }catch(e: IllegalArgumentException){
                print("Operator does not exist. Try again: ")
            }
        }
    }
}

//Função para obter números inteiros da consola
fun input_number ():Int{
    var number:Int
    while(true){
        val input= readln()
        try{
            number= input.toInt()
            break
        }catch (e: NumberFormatException){
            print("Operand is not a number. Try again: ")
        }
    }
    return number
}

//Função para obter doubles da consola
fun input_double ():Double{
    var number: Double
    while(true){
        val input= readln()
        try{
            number= input.toDouble()
            break
        }catch (e: NumberFormatException){
            print("Operand is not a number. Try again: ")
        }
    }
    return number
}

//Função para obter booleanos da consola
fun input_bool (): Boolean{
    var bool: Boolean
    while(true){
        val input= readln()
        if(input.lowercase().equals("true") || input.lowercase().equals("false")){
            bool= input.toBoolean()
            break
        }
        print("Operand is not a boolean. Try again: ")
    }
    return bool
}

fun sum (number_1:Double, number_2:Double):String{
    val sum= number_1 + number_2
    return "Result: $sum    Decimal: ${sum.toInt()}    Hexadecimal: ${sum.toInt().toString(16)}"
}

fun sub (number_1:Double, number_2:Double):String{
    val sub= number_1 - number_2
    return "Result: $sub    Decimal: ${sub.toInt()}    Hexadecimal: ${sub.toInt().toString(16)}"
}

fun mult (number_1:Double, number_2:Double):String{
    val mult= number_1 * number_2
    return "Result: $mult   Decimal: ${mult.toInt()}    Hexadecimal: ${mult.toInt().toString(16)}"
}

fun divide (number_1:Double, number_2:Double):String{
    if(number_2 == 0.0){
        return "Error: Division by zero"
    }
    val div= number_1 / number_2
    return "Result: $div    Decimal: ${div.toInt()}    Hexadecimal: ${div.toInt().toString(16)}"
}

fun and (bool_1: Boolean, bool_2: Boolean):String{
    val and= bool_1 && bool_2
    return "Result: $and    Decimal: ${if(and) 1 else 0}"
}

fun or (bool_1: Boolean, bool_2: Boolean):String{
    val or= bool_1 || bool_2
    return "Result: $or Decimal: ${if (or) 1 else 0}"
}

fun notBool (bool_1: Boolean): String{
    val notbool= !bool_1
    return "Result: $notbool    Decimal: ${if (notbool) 1 else 0}"
}

fun shiftLeft (number: Int, increment: Int): String{
    val shift= number shl increment
    return "Result: $shift  Decimal: $shift   Hexadecimal: ${shift.toString(16)}"
}

fun shiftRight (number: Int, increment: Int): String{
    val shift= number shr increment
    return "Result: $shift  Decimal: $shift   Hexadecimal: ${shift.toString(16)}"
}