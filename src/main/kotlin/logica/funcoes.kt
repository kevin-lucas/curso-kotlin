// fun é uma palavra reservada para criar funções
//var fun = "teste";

// criando função
/*
fun calculaBonus(a: Int): Int {
    return a + 1 // retorno da função
}
 */

fun calculaBonus(a: Int, b: Int, c: Int){
    // mudamos a lógica uma vez na função se for preciso
    println("O bonus é: ${a + b * c}")
}

fun hello(nome: String) : String{
    return "Olá, $nome."
}

fun main() {
    val a = 10
    val b = 20
    val c = 30

    println("O bonus é: ${a + b * c}")
    println("O bonus é: ${a + b * c}")
    println("O bonus é: ${a + b * c}")

    // utilizando funções (os valores mudam mais a lógica não)
    calculaBonus(1, 3, 4)
    calculaBonus(1, 4, 43)
    calculaBonus(12, 43, 42)

    // funcao com retorno
    println(hello("Fulano"))

}