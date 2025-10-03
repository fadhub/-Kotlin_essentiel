package com.example.kotlinessentiel.demo

import android.R
//Fonctions finales
fun celsiusTof(c:Double) = c * 9 / 5 + 32
fun greet(name: String, punctuation: String = "!") =
    "Bonjour, ${name.trim()}$punctuation"
fun avg(vararg numbers: Int) = numbers.average()
fun String.sanitized() = trim().replace(Regex("\\s+"), " ")

//Lambdas finales
val square = { x: Int -> x * x }
val shout: (String) -> String = { it.uppercase()}

//main() Final
fun main(){
    //1-expression body
    println(celsiusTof(0.0))
    println(celsiusTof(100.0))

    //2- valeurs par defaut + nommes
    println(greet("Ada"))
    println(greet("Alan", punctuation = "!!"))

    //3- vararg(+ spread)
    println(avg(1,2,3,4))
    val arr = intArrayOf(2,4,6)
    println(avg(*arr))

    // 4- lambas
    println(square(5))
    println(shout("Kotlin"))

    //5- ectention
    println(" Hello kolin ".sanitized())

}