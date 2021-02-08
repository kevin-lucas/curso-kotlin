package poo.construtores

class Pessoa2(var nome: String){

    // liberando acesso ao attr ano
    var ano: Int? = null

    // construtur segudário
    // obrigatório a chamada do construtor primário
    // acresentar mais atributos para diferenciar do primário
    // os atributos do contruturo são acessiveis em outro local
    constructor(nome: String, ano: Int) : this(nome){
        this.ano = ano // acessando o attr do construtor
    }

    fun saudacao(){
        println("Olá, meu nome é $nome e nasci no ano $ano")
    }

}

fun main() {

    val p1: Pessoa2 = Pessoa2("Fulano")
    val p2: Pessoa2 = Pessoa2("Silva", 1990)
    p2.saudacao()
    p1.saudacao()

}