fun main() {

    val str = "Lorem ipsum"
    println(str.capitalize())
    println(str.decapitalize())
    println(str.contains("bla bla"))
    println(str.startsWith("l")) // não precisei passar os outros parametros
    println(str.startsWith("l", true)) // passei o segundo parametro

    // varargs
    val lista = arrayOf("teste", 1, true) // criar uma lista
    for (item in lista){
        println(item)
    }
}