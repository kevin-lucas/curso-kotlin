package poo

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        // sobrescrevendo o texto aprensentado para essa enum
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
    },


    MEDIA(5), ALTA(10)
}

class Alarme(var descricao: String, val p: Prioridade2)

fun main() {
    // ajudar a centralizar e definir padrões do código
    Prioridade.BAIXA

    println(Prioridade.BAIXA) // exibe da mesma forma como uma string

    // Prioridade 2
    println(Prioridade2.BAIXA.id) // exibe o valor associado a constante

    // exibindo todos
    for (p in Prioridade2.values()) {
        // ordinal - representa a posição que está localizado na declaração
        println("$p - ${p.id} - ${p.ordinal}")

        // utilizado para comparar como string
        if (p.toString() == "MEDIA") {
            println("Esse é verdade!")
        }
    }

    // utilizado enum como attr
    val a = Alarme("Aviso!", Prioridade2.ALTA)
    println(a.p)
}