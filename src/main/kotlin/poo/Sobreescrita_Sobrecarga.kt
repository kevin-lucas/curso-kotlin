package poo

open class Maquina7(val marca: String) {
    // open abre o metodo para ser sobreescrito
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

class Computador1(marca: String, val nucleos: Int) : Maquina7(marca) {

    override fun minhaMarca() {
        "Estou sobreescrevendo minha marca" // personalizando a classe
        //super.minhaMarca() // super chama a funcao da classe pai
    }

    fun ligar() {}
    fun processar() {}

    // sobreescrita são metodos com assinaturas diferentes
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 1") // tipo de parametro diferente
    fun overload(i: Int, i2: Int) = println("Overload 1") // qtd parametros difentes

}

fun main() {
    val c = Computador1("xpto", 10)
    with(c) {
        ligar()
        processar()
        minhaMarca()
        overload(1) // chamado 1 overload
        overload(2, 3) // chamando outro overload
    }
}