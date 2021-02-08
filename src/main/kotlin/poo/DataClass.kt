package poo

class Quadrado(val area: Float)

data class Triangulo(val area: Float)

// classe utilizada somente para transitar dados
data class Param(var b: Boolean, var s: String, var i: Int) {
    fun tes() {
        println("tesdfds")
    }
}

fun teste(p: Param) {
    Param(false, "ssdf", 10).tes()
}

fun main() {

    // sem data class
    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    // com data class
    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    // diferenças entre a class e o data classe
    println(q1) // exibe valor na memória
    println(t1) // exibe formatado como string

    println(q1 == q2) // compara a posição na memoria
    println(t1 == t2) // compara os valor dos atributos

    // exibe valores diferentes com base posição da memoria
    println(q1.hashCode())
    println(q2.hashCode())

    // exibe o valor com base nos valores dos atributos da objeto
    println(t1.hashCode())
    println(t2.hashCode())

    //copy
    val t3 = t2.copy() // copia todos os valores
    println(t3)
}