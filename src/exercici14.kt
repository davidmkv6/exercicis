import java.util.Scanner

// Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de pagar cada començal.
fun main() {
    val scanner = Scanner(System.`in`)
    val comencals = scanner.nextInt()
    val preu = scanner.nextDouble()
    println(preu / comencals)
}