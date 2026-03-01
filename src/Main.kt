/*fun main() {
    println("Lab Récursion – Calculer la factorielle")

    //Tester la fonction
    println("factorialIterative(56) = " + factorialIterative(56))
    println("factorialIterative(9) = " + factorialIterative(9))
    println("factorialIterative(2) = " + factorialIterative(2))

}*/
// Définir la fonction itérative
fun factorialIterative(number: Int): Int {
    var accumul = 1

    for (i in 1..number) {
        accumul = accumul * i
    }

    return accumul
}
fun factorialRecursive(number: Int): Int {
    if (number <= 1) {
        return 1
    }

    return factorialRecursive(number - 1) * number
}
fun factorialTrace(number: Int): Int {
    println("Appel de factorialTrace($number)")

    if (number <= 1) {
        println("Base case atteint pour $number, retour 1")
        return 1
    }

    val result = factorialTrace(number - 1) * number
    println("Retour de factorialTrace($number) = $result")
    return result
}/*
fun main() {
    println("Lab récursion – Factorielle")

    println("=== Version itérative ===")
    println("factorialIterative(4) = " + factorialIterative(4))

    println("=== Version récursive ===")
    println("factorialRecursive(4) = " + factorialRecursive(4))
    println("factorialRecursive(5) = " + factorialRecursive(5))
}

*/
fun factorialSafe(number: Int): Int {
    if (number < 0) {
        println("Factorielle non définie pour les nombres négatifs: $number")
        return 0
    }
    if (number <= 1) {
        return 1
    }
    return factorialSafe(number - 1) * number
}
/*
fun main() {
    println("=== Trace récursive ===")
    val r = factorialTrace(4)
    println("Résultat final = $r")
}
*/

