package dam.exer_3

import java.math.RoundingMode

//Exercise 3 - A ball is dropped from a height of 100 meters. Each time it bounces, it reaches 60% of its
//previous height. Write a program using generateSequence to model the bounce heights,
//filter to keep only bounces that reach at least 1 meter high, take the first 15 qualifying
//bounces, convert to a list, and print the heights rounded to 2 decimal places.

fun main() {
    val curr_height= 100.00 //meters

    val height_sequence= generateSequence(curr_height, {if(it * 0.60 > 1) it * 0.60 else null})
    val height_list= height_sequence.take(15).toList() //tirar os primeiros 15 elementos

    for(height in height_list){
        println(height.toBigDecimal().setScale(2, RoundingMode.HALF_UP))
    }
}