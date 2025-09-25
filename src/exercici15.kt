import java.util.Scanner

// Fes un programa que afegeixi 1 segon un nombre de segons determinat.
fun main() {
    val scanner = Scanner(System.`in`)
    val segons = scanner.nextInt()
    var resultat = segons + 1
    if(resultat >= 60) {
        resultat = 0
    }
    println(resultat)
}