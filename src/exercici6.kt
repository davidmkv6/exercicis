import java.util.Scanner

// En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total. Dependrà del nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.

fun main() {
    val scanner = Scanner(System.`in`)
    val pupitresClasse1 = scanner.nextInt()
    val pupitresClasse2 = scanner.nextInt()
    val pupitresClasse3 = scanner.nextInt()
    println((pupitresClasse1 / 2 + pupitresClasse1 %2) + (pupitresClasse2 / 2 + pupitresClasse2 %2) + (pupitresClasse3 / 2 + pupitresClasse3 %2))
}