import java.util.Scanner

// L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat per el mòdul del tercer amb el quart.

fun main() {
    val scanner = Scanner(System.`in`)
    val numero1 = scanner.nextInt()
    val numero2 = scanner.nextInt()
    val numero3 = scanner.nextInt()
    val numero4 = scanner.nextInt()
    println((numero1 + numero2) * (numero3 % numero4))
}