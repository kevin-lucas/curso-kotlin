import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    //println("sgdd".toInt()) // quebra a execução do programa.
    try {
        println("sgdd".toInt()) // tenta executar a conversão
    } catch (n: NumberFormatException) {
        // trata uma exeção mais esepecifica
        println("Esse valor não é um número")
    } catch (e: Exception) {
        println("Algo de errado ocorreu")
        println(e.message)
    } finally {
        println("é sempre executado, com erro ou sem erro.")
    }

}