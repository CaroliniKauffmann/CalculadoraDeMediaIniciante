import java.util.*

fun main() {

    val leia = Scanner(System.`in`)

    println("Digite sua 1ª nota: ")
    val nota1 = leia.nextFloat()

    println("Digite sua 2ª nota: ")
    val nota2 = leia.nextFloat()

    println("Digite sua 3ª nota")
    val nota3 = leia.nextFloat()

    println("Digite sua 4ª nota")
    val nota4 = leia.nextFloat()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    println("Sua média final é $media")

    if (media > 5) {
        println("Sua média é $media, você foi Aprovado!")
    } else {
        println("Sua média é $media, você foi Reprovado")
    }


}
