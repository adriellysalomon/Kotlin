fun main() {
    var altura = 1.63
    var peso = 81
    var resultado = 0

    resultado = (peso / altura * altura).toInt()

    if (resultado <= 18) {
        println("seu IMC está considerado - Magreza")
    } else if (resultado > 19 && resultado < 24) {
        println("seu IMC está considerado - Saudável")
    } else if (resultado > 25 && resultado <= 29) {
        println("seu IMC está considerado - Sobrepeso")
    } else if (resultado > 30 && resultado <= 34){
        println("seu IMC está considerado - Obesidade Grau I")
    } else  if (resultado > 35 && resultado <= 39) {
        println("seu IMC está considerado - Obesidade Grau II")
    } else {
        println("seu IMC está considerado - Obeseidade Grau III")
    }
}