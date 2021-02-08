fun main() {

    // especifico que a variável por ser nula e atribuo a ela null
    val str: String? = null

    println(str)

    println(str?.length) // invocando de forma null safe
    println(str!!.length) // informa que entende que pode dar erro e aceita se o erro acontecer

    // kotlin aceita se for tratado antes
    if (str != null)
        println(str.length)
}