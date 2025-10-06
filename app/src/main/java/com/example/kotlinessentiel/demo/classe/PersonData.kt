package com.example.kotlinessentiel.demo.classe

// Data class
data class PersonData(val name: String, val age: Int)


fun main() {
    println("=== Data class copy et déstructuration ===")
    val pd1 = PersonData("Ada", 36)
    val pd2 = pd1.copy(age = 37)
    println("pd1: $pd1")
    println("pd2: $pd2")

    val (name, age) = pd2
    println("name=$name, age=$age")

    println("\n=== Data class dans Set ===")
    val s = setOf(
        PersonData("Ada", 36),
        PersonData("Ada", 36),
        PersonData("Bob", 30)
    )
    println(s)

    println("\n=== Data class dans Map ===")
    val m = mapOf(
        PersonData("Ada", 36) to "Dev",
        PersonData("Bob", 30) to "Designer",
        PersonData("Ada", 36) to "Manager"
    )
    println(m)
}
