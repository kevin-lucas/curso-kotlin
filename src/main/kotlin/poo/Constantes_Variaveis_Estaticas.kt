package poo

// é comum fechar o construtor dessas classes, para que ela não seja instanciada
class Constante private constructor() {

    // cria variáveis e métodos estáticos no kt
    companion object BANCO {
        val TABLE = "pessoa"

        fun teste(){
            println("Sou um método estático.")
        }
    }

    // Mesmo conceito do companion object <Obrigatório ter um nome>
    object VENDAS {
        val TABLE_NAME = "vendas"

        object COLUNAS {
            val ID = "id"
            val TOTAL = "total"
        }
    }

}

fun main() {
    Math.PI // variável estática do java
    println(Constante.TABLE) // variável estática do kt
    println(Constante.BANCO.TABLE) // variável estática do kt
    println(Constante.teste()) // método estático do kt

    println(Constante.VENDAS.TABLE_NAME)
    println(Constante.VENDAS.COLUNAS.ID)
    println(Constante.VENDAS.COLUNAS.TOTAL)
}