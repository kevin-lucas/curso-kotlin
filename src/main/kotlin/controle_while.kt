fun main() {

    /*
    while (true){
        println("loop infinito")
    }
     */

    var index: Int = 0
    while (index < 100){
        print("$index ")
        index++

        if (index == 50){
            break // quebra a execução do loop
        }
    }


}