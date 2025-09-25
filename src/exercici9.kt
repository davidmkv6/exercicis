import java.util.Scanner

// Llegeix el preu original i el preu actual i imprimeix el descompte (en %).

fun main() {
    val scanner = Scanner(System.`in`)
    val preuOriginal = scanner.nextDouble()
    val preuDescomptat = scanner.nextDouble()
    println((1 - preuDescomptat / preuOriginal) * 100)
}