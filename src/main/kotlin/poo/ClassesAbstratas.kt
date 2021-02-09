package poo

abstract class Mamifero(var nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    fun dormir() {
        println("Estou dormindo!")
    }

}

class Cachorro(nome: String, meuPeso: Float) : Mamifero(nome) {

    // é executado quando a classe é instanciada (executado independente do constutores)
    init {
        //this.peso = 100f
        this.peso = meuPeso
    }

    override fun falar() {
        println("Au au!")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("Mi au!")
    }

}

fun main() {

    // classes abstratas - não podem ser instanciadas
    // Mamifero("Teste")

    // os metodos abstratos são obrigátorios sua implementação pela classe filho
    val c = Cachorro("Dog", 7f)
    c.falar()
    c.dormir() // metodo normal herdado do pai
}