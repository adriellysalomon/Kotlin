fun main() {
    var age: Int = 10
    when (age) {
        10 -> print("voce ja é um pré adolescente")
        16 -> print("Hum, vocêja esta quase na maior idade!")
        18, 20 -> print("Uhull você ja é de maior!!")
        else -> {
            print("por hoje é só!")
        }
    }
}