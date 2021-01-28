fun main() {

    var b = 127 // Declaração do tipo implícitamente
    var bb: Byte = 1 // Declaração do tipo explícitamente.

    var i: Int = 12
    var f: Float = 14F

    var bo: Boolean = false

    var s: String = "Texto"
    var c: Char = 'T'

    println("Double: Max: " + Double.MAX_VALUE + " - Double: Min: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Float: Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: Min: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Int: Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Short: Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Byte: Min: " + Byte.MIN_VALUE)
}