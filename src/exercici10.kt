import java.util.Scanner

// Llegeix el diàmetre d'una pizza rodona i imprimeix la seva superfície.

fun main() {
    val scanner = Scanner(System.`in`)
    val diametro = scanner.nextDouble()
    val radio = diametro / 2
    println(radio * radio * Math.PI)
}