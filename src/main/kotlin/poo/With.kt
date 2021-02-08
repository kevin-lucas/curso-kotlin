package poo

class Maquina4(var marca: String) {
    var nucleos: Int = 0
        get() {
            // personalizando o get
            println("Get foi chamado")
            return field
        }
        set(value) {
            // personalizando o set
            println("Set foi chamado")
            field = value // palavra reservada para utilizar o get sem invoar erros.
        }

    // conceito de kt que facilita a programação
    fun ligar(){

    }

    fun processar(){

    }

    fun desligar(){

    }
}

fun main() {
    var m = Maquina4("xpto")
    m.ligar()
    m.processar()
    m.desligar()

    // chamado as funções do objeto com with
    with(m){
        ligar()
        desligar()
        processar()
    }
}