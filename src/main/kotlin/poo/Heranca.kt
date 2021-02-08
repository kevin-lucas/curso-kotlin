package poo

// open permite que a classe seja herdada por outra
open class Maquina6(val marca: String){
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina6(marca) {

    fun ligar(){}
    fun processar(){}
}

fun main() {
    val c = Computador("xpto", 10)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }
}