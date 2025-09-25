import java.util.Scanner

// Escriu un programa que llegeixi un nombre enter i imprimeixi una frase amb el següent nombre enter.

fun main() {
    val scanner = Scanner(System.`in`)
    val numero = scanner.nextInt()
    println("Després ve el " + (numero + 1))
}