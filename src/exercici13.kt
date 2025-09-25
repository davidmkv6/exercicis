import java.util.Scanner

// Escriu un programa que llegeixi un una temperatura i un augment d’aquest, el programa ha d’imprimir per pantalla quina és la temperatura amb l’augment aplicat.
fun main() {
    val scanner = Scanner(System.`in`)
    val temperatura = scanner.nextDouble()
    val augment = scanner.nextDouble()
    println("La temperatura actual és " + (temperatura + augment))
}