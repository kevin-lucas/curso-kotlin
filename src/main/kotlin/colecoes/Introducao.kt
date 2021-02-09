package colecoes

// O Kotlin não tem coleções, ele usa coleções nativos do Java

fun main(args: Array<String>) {

    // List - Array, Set, HashMap

    // está é uma lista imutável
    val l1 = listOf("Madri", "São Paulo", "Berlim")
    // l1.add() // metodo não existe

    // está é uma lista mutável
    val l2 = mutableListOf("Madri", "São Paulo", "Berlim")
    l2.add("Belo Horizonte") // adicionando novo item

    val a3 = arrayListOf("Madri", "São Paulo", "Berlim") //não tem versão mutável
    // possui os métodos do java, por herda do arraylist do java
    a3.add("Dubai")
    a3.remove("Madri")

    // não adiciona itens repetidos
    val s1 = setOf("Madri", "São Paulo", "Berlim", "Berlim")
    println(s1.size)

    // permite fazer alterações
    val s2 = mutableSetOf("Madri", "São Paulo", "Berlim", "Berlim")
    s2.add("Teste")
    println(s1.size)

    // chave / valor (não tem um versão mutável, ele já é mutável)
    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    println(h1.entries) // exibe as entradas da coleção
    println(h1["França"]) // exibindo o valor com base na chave
    //h1.entries.add();

    // implementação do HashMap do java
    val m2 = mapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    // m2.entries.add() // não está disponível

    // na prática não tem diferença com o hashMapOf
    val m3 = mutableMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    //m3.entries.add()
}