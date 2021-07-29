import java.util.*
import kotlin.collections.ArrayList


class Aluno {
    private val leia = Scanner(System.`in`)

    private var nome = "string"
    private var ano = 0
    private var notas: ArrayList<Float> = ArrayList()


    fun preencherNome(){
        println("Preencha seu nome:  ")
        nome = leia.next()
    }

    fun preencherAno() {
        println("Qual seu Ano: ")
        ano = leia.nextInt()
    }

    fun preencherNotas(totalDeNotas:Int) {
        notas.clear()

        for (indice in 1..totalDeNotas) {
            println("Digite a nota $indice")
            notas.add(leia.nextFloat())
        }

    }

    private fun calcularMedia(): Float {
        val totalDeNotas = notas.size
        val soma = notas.sum()
        return soma / totalDeNotas
    }

    fun mostrarResultadoMedia() {
        println("Aluno: $nome, do ano $ano, teve a média ${calcularMedia()}")
    }

    fun verificarAprovacao(mediaAprovacao:Int) {
        if (calcularMedia() >= mediaAprovacao) {
            println("Você foi aprovado!")
        } else {
            println("Você foi reprovado!")
        }

    }
}
