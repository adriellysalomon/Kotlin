fun main() {
    var resultado = 1

    println("Digite um número qualquer")
    var numerodigitado = readLine()!!.toInt()
    for (num in 1..10) {
        resultado = numerodigitado * num
        println("a tabuada do número $numerodigitado x $num = $resultado")
    }

}






