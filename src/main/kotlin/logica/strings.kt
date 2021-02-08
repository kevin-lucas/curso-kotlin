fun main() {
    val frase = "Kotlin é uma linguagem de programação "
    println(frase) // imprime no console

    // Concatenação
    val caracteristica = "Show!"
    val i = 10
    println(frase + caracteristica + i)
    println("Kotlin é uma linguagem $caracteristica")
    // String multilinhas
    val str = """asdasdasd as
        asdasdas
        qsasdasdasdas    
        asdasdadsasd """
    println(str)

    // Tamanho (propiedades)
    println(str.length)
    println("Kotlin é uma linguagem ${caracteristica.length}")
}