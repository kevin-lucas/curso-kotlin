fun endereco(rua: String, cidade: String, estado: String, cep: String, numero: Int = 0){
    println("Rua $rua, $numero")
    println("Cidade: $cidade, $estado - $cep")
}

fun main() {
    endereco("Alberto Cintra", "BH", "MG", "33980090", 103)
    endereco("Alberto Cintra", "BH", "MG", "33980090") // numero não sendo passado
    endereco(rua = "Silviano Brandão", cidade = "São Paulo", cep = "3212432", estado = "SP")
    endereco(rua = "Silviano Brandão", cidade = "São Paulo", cep = "3212432", estado = "SP", numero = 123)
}