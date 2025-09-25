import java.util.Scanner

// Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació. Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.
fun main() {
    val scanner = Scanner(System.`in`)
    val llargada = scanner.nextDouble()
    val ample = scanner.nextDouble()
    val alcada = scanner.nextDouble()
    println(llargada * ample * alcada)
}