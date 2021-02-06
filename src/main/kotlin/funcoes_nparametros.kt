fun media(n1: Double, n2: Double) {

}

fun media(vararg notas: Double) {
    println(notas.size)
    if (notas.isNotEmpty()) {
        var soma = 0.0

        for (nota in notas) {
            soma += nota
        }

        println("A média é: ${soma / notas.size}")
    }
}

fun <T> media(vararg valores: T){
    for (valor in valores){
        println(valor)
    }
}

fun main() {
    media(12.0, 23.0)
    media(12.12, 34.3, 23.32, 43.0, 43.0, 23.0) // varargs
    media("texto", 23, 34.5, 34f, 103) // aceita parametros de tipos diferentes
}