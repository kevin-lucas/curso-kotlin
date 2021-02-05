fun main() {
    // for - loop
    // loop infinito

    val srt = "Fulano de tal"
    for (c in srt) {
        print("$c ")
    }

    println("")
    for (i in 1..100) {
        print("$i ")
    }

    println("")
    // pula de 2 em 2
    for (i in 1..100 step 2) {
        print("$i ")
    }

    println("")
    for (i in 1..100) {
        if (i != 80) {
            print("$i ")
        }
    }

    println("")
    // decrementando
    for (j in 100 downTo 0) {
        print("$j ")
    }
}