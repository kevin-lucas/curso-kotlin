package poo

class Peson {

    lateinit var nome: String // declaro que a variável será inicializada depois

    fun geradorNome(){
        nome = "asdasd"
    }
}

fun main() {
    val p = Peson()
    p.geradorNome()
}