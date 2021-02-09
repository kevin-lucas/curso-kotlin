package colecoes

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun main(args: Array<String>) {

    val data = listOf(
        Food(
            "Lasanha", 1200.0, listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjerição", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food(
            "Hamburger", 2000.0, listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburger", 1),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1),
            )
        ),
    )

    // tenho receita na lista?
    println(if (data.any()) "sim" else "não")
    // quantas receitas tenho na colecao?
    println(data.count())
    // qual a primeira e ultima receita?
    println("Primeira ${data.first().name}")
    println("Ultima ${data.last().name}")

    // qual a soma das colorias?
    var sum: Int = 0
    for (x in data) {
        sum = sum + x.calories.toInt()
    }

    // com colecao
    val sumCaloriesI = data.sumBy { it.calories.toInt() }
    val sumCaloriesD = data.sumByDouble { it.calories }
    // listOf(1, 2, 3, 4).sum() // metodo para somar

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} = ${x.value.name}")
    }

}