fun main() {
    var codigo = "EEWBD"
    var quantidadeMinima = 10
    var quantidadeMaxima = 100
    var estoqueMedio = 20
    var quantidade = 50
    var valor = 2
    var resultado = 0

    resultado = quantidade * valor

    println("O código da peça é $codigo cujo o seu valor total é $resultado ")

    estoqueMedio = quantidadeMinima + quantidadeMaxima / 2

    println(
        "Para ter um estoque de peças eficiente, deve-se ter em média a quantidade de $estoqueMedio"
    )

    if (estoqueMedio > 100) {
        println("Legal, seu estoque está ótimo")
    } else {
        println("Xii, com essa quantidade você ficará em apuros ")

    }


}

