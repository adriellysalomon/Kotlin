fun main() {
    var altura = 1.63
    var peso = 81
    var resultado = 0

    resultado = (peso / altura * altura).toInt()

    if (resultado <= 18) {
        println("seu IMC está considerado - Magreza")
    } else {
        (resultado > 19 && <= 24)
        println("seu IMC está considerado - Saudável")
    } if else {
        (resultado > 25 && <= 29)
        println("seu IMC está considerado - Sobrepeso")
    } else {
        (resultado > 30 && <= 34)
        println("seu IMC está considerado - Obesidade Grau I")
    } if else {
        (resultado > 35 && <= 39)
        println("seu IMC está considerado - Obesidade Grau II")
    } else {
        (resultado > 40)
        println("seu IMC está considerado - Obeseidade Grau III")
    }
}