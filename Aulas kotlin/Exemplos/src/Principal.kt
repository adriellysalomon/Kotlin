fun main() {
    println("Digite sua idade")
    var age: Int = readLine()!!.toInt()

    if (age >= 18) {
        println("Legal, você é maior de idade!")
    } else {
        println("que pena, você é menor de idade :/ ")

    }
    println("Digite seu nome")
    var name = readLine()
    println("Bem vindo $name")
}
