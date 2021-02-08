fun teste(n1: Int){

}

fun main() {
    val l1: Long = 100
    //teste(1 * l1) // ocorre a conversão para o maior(armazenamento) tipo

    // (atenção) os números menores não tem a capacidade de armazenar os números maiores
    val n1: Double = Double.MAX_VALUE
    val b1: Byte = n1.toByte()

    println(b1) // -1


    // os tipos da conversão tem a capacidade de armazenar
    val b2: Byte = 100
    println(b2.toDouble())
    println(b2.toFloat())
    println(b2.toInt())

    // conversão de string para numericos
    println("19".toInt())
    println("19".toDouble())
    println("19".toFloat())
    // println("ste".toFloat()) // NumberFormatException
}