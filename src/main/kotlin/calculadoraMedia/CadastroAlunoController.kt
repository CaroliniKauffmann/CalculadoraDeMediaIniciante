package calculadoraMedia
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/cadastro/aluno")
class CadastroAluno {

    @PostMapping("/novo")
    fun cadastroAluno(): String {
        return "Funcionou"
    }

}