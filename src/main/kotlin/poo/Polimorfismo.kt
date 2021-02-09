package poo

interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 500")
    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bonus: 100")
    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        println("Bonus 1000")
    }
}

fun main() {
    // instancio funcionarios diferentes (polimorfismo)
    val gerente: Funcionario = Gerente()
    val tecnico: Funcionario = Tecnico()
    val analista: Funcionario = Analista()

    cal(gerente)
    cal(tecnico)
    cal(analista)
}

fun cal(funcionario: Funcionario){
    funcionario.calculaBonus()
}