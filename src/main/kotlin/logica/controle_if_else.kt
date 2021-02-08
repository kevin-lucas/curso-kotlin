fun maiorDeIdade(idade: Int) {
    // if else
    if (idade > 18) {
        println("Maior de idade")
    } else {
        println("Não é maior de idade")
    }
}

fun maiorDeIdadeComRetorno(idade: Int): Boolean {
    // if else
    if (idade > 18) {
        return true
    } else {
        return false
    }
}

// Com o retorno do tipo Boolean posso simplificar a lógica
fun maiorDeIdadeComRetornoSimplificado(idade: Int): Boolean {
    // if else
    return idade > 18
}

fun calculaBonus(cargo: String, salario: Double): Double {
    // Gerente Junior, Gerente Senior, Coordenador

    var retorno = salario

    if (cargo == "Coordenador") {
        return salario * 0.2
    } else {
        if (cargo.contains("Gerente")) {
            if (cargo == "Gerente Senior") {
                return salario * 2
            } else {
                return salario * 0.5
            }
        }
    }

    return salario
}

fun calculaBonus2(cargo: String, salario: Double): Double {
    // Gerente Junior, Gerente Senior, Coordenador

    // retornando o if
    return if (cargo == "Coordenador") {
        salario * 0.2
    } else if (cargo == "Gerente Junior") {
        salario * 0.5
    } else {
        salario * 2
    }
}

fun main() {

    maiorDeIdade(10)
    println(maiorDeIdadeComRetorno(10))
    println(maiorDeIdadeComRetornoSimplificado(10))

    println(calculaBonus("Gerente Senior", 5000.0))
    println(calculaBonus("Gerente Junior", 5000.0))
    println(calculaBonus("Coordenador", 5000.0))

    println(calculaBonus2("Programador", 5000.0))
}