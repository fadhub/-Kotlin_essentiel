package com.example.kotlinessentiel.demo.classe

// Classe normale sans overrides
class PersonClassic(val name: String, val age: Int)

// Classe normale avec equals/hashCode/toString et copy
class PersonClassicFull(val name: String, val age: Int) {
    fun copy(name: String = this.name, age: Int = this.age) = PersonClassicFull(name, age)

    override fun toString(): String = "PersonClassicFull(name=$name, age=$age)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersonClassicFull) return false
        return name == other.name && age == other.age
    }

    override fun hashCode(): Int = 31 * name.hashCode() + age
}


fun main() {
    println("=== Classe normale sans overrides ===")
    val p1 = PersonClassic("Ada", 36)
    val p2 = PersonClassic("Ada", 36)
    println("p1 == p2 ? ${p1 == p2}")  // false

    println("\n=== Classe normale avec overrides ===")
    val p3 = PersonClassicFull("Ada", 36)
    val p4 = PersonClassicFull("Ada", 36)
    val p5 = p3.copy(age = 37)

    println("p3 == p4 ? ${p3 == p4}")
    println("p3: $p3")
    println("p5: $p5")
}
