package poo

open class Maquina8(val marca: String) {
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}
// por padrão o public é o modificador de acesso
class Computador2(marca: String, val nucleos: Int) : Maquina8(marca) {

    override fun minhaMarca() {
        "Estou sobreescrevendo minha marca"
    }

    private fun ligar() {} // torna a função utiliza somente dentro da classe

    fun processar() {}

    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 1")
    fun overload(i: Int, i2: Int) = println("Overload 1")
}

fun main() {
    val c = Computador2("xpto", 10)
    with(c) {
        //ligar()
        processar()
        minhaMarca()
        overload(1)
        overload(2, 3)
    }
}