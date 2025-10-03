package com.example.kotlinessentiel.demo.Nullsafety
import com.example.kotlinessentiel.demo.greet

fun greet(input: String?): String =
    input
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.let { "Bonjour, $it !" }
        ?: ""

fun parseCount(input: String?): Int =
    input
        ?.trim()
        ?.toIntOrNull()
        ?.coerceAtLeast(0)
        ?: 0

fun safeAt(xs: List<Int>, index: Int): Int =
    xs.getOrNull(index) ?: -1

fun parseAnyToNonNegativeInt(x: Any?): Int =
    (x as? String)?.toIntOrNull()?.coerceAtLeast(0) ?: 0

fun lengthOrZero(s: String?): Int =
    s?.length ?: 0

fun nonNullOrFail(s: String?): String =
    requireNotNull(s) { "Valeur requise non fournie" }

fun main() {
    println("=== DEMO Null-safety ===")

    // --- Démo greet ---
    println("greet(null)            => '${greet(null)}'")
    println("greet(\"  \")           => '${greet("  ")}'")
    println("greet(\"  Fadna \")       => '${greet("  Fadna ")}'")

    // --- Démo parseCount ---
    println("parseCount(null)       => ${parseCount(null)}")
    println("parseCount(\" -5 \")    => ${parseCount(" -5 ")}")
    println("parseCount(\" 12 \")    => ${parseCount(" 12 ")}")

    // --- Démo safeAt ---
    val numbers = listOf(10, 20)
    println("safeAt([10,20], 1)     => ${safeAt(numbers, 1)}")
    println("safeAt([10,20], 9)     => ${safeAt(numbers, 9)}")

    // --- Démo parseAnyToNonNegativeInt ---
    println("parseAnyToNonNegativeInt(\"42\")  => ${parseAnyToNonNegativeInt("42")}")
    println("parseAnyToNonNegativeInt(\"x\")   => ${parseAnyToNonNegativeInt("x")}")
    println("parseAnyToNonNegativeInt(null)   => ${parseAnyToNonNegativeInt(null)}")

    // --- Démo lengthOrZero ---
    println("lengthOrZero(null)     => ${lengthOrZero(null)}")
    println("lengthOrZero(\"Kotlin\") => ${lengthOrZero("Kotlin")}")

    // --- Démo nonNullOrFail ---
    println("nonNullOrFail(\"OK\")   => ${nonNullOrFail("OK")}")
}
