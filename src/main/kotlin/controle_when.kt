fun operacao(a: Int, b: Int, c: String): Int {
    when (c) {
        "Soma" -> return a + b
        "Subtração" -> {
            return  a - b
        }
        // retorno padrão
        else -> return 0
    }
}

fun operacao2(a: Int, b: Int, c: String) {
    when {
        a > 0 && b > 0 -> {
            println("Variáveis maior que zero")
        }
    }

    when (a){
        0 -> println("0")
        1 -> println("1")
        2 -> println("2")
    }

    when {
        // range em kotlin
        a in 1..99 -> {
            println("está dentro de 100")
        }
    }
}



fun main() {
    println(operacao(1, 3, "Soma"))
    println(operacao2(2, 3, "Soma")) // retorna true ou false
}