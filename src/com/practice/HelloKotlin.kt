package com.practice

fun main(args:Array<String>){

    print("Hello Kotlin !!")
    println("Max 5,4 is :" + max(5,4))
}

fun max (x: Int, y: Int): Int {
    return if(x > y) x else y
}