package poo

class Maquina2(var marca: String) {
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
}

fun main() {
    var m = Maquina2("xpto")
    println(m.nucleos)
    m.nucleos = 10
}