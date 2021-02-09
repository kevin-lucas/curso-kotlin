package poo

// a interface é como se fosse um contrato, elas são implementadas.
// A inteface é implementada e as classes abstratas são herdadas
// as interfaces não podem ter estado, atribuição de valor a variáveis
// não exite herança multipla no kt, mais podemos implementar várias interfaces
interface Maquina9 {

    var peso: Float

    fun ligar()
    // as interfaces agora podem ter corpo nos metodos
    fun desligar(){
        println("Desligando...")
    }
}

interface Inteface1 {
    fun ola(){
        println("inteface 1")
    }
}

interface Interface2 {
    fun ola(){
    }
}

class ImplementaInteface : Inteface1, Interface2 {
    override fun ola() {
        super<Inteface1>.ola()
    }
}

class Computador9(override var peso: Float) : Maquina9 {
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {

    }

}

fun main() {

}