package poo

class Pessoa1

// defindo uma classe
class Pessoa2(var nome: String, var anoNascimento: Int)

// classe com atr e comp
class Pessoa3(var nome: String, var anoNascimento: Int) {
    fun saudacao() {
        println("Olá, meu nome é $nome.")
    }
}

fun main() {

    // instanciando uma classe
    val pessoa: Pessoa3 = Pessoa3("Jose da Silva", 1990)
    // acessando os atributos
    println(pessoa.nome)
    println(pessoa.anoNascimento)
    // invocando metodo da classe
    pessoa.saudacao()
}