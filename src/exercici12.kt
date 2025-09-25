import java.util.Scanner

//Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit
fun main() {
    val scanner = Scanner(System.`in`)
    val grausCelsius = scanner.nextDouble()
    println((grausCelsius * 1.8) + 32)
}