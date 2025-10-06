package com.example.kotlinessentiel.demo.bon_pratique

class person(val name: String, val age: Int){
    fun isAdult() = age >= 18
}


fun greet(name: String) = println("Bonjour, $name")
fun checkAge(age: Int)=
    if(age >= 18) "Majeur" else "Mineur"


data class counter(var value: Int = 0){
    fun increment(){
        value++
    }
}




//main

fun main(){

    //person
    val p = person("FADNA",23)
    println("${p.name} est adulte ? ${p.isAdult()}")


    //fonction simple
    greet("FADNA")
    println(checkAge(16))


    //counter
    val counter = counter()
    println("Compteur initial : ${counter.value}")
    counter.increment()
    counter.increment()
    println("Compteur apres increment : ${counter.value}")
}