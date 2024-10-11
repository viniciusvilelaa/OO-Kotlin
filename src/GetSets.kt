public class GetSets() {
    var nome = ""

    init {
        this.nome = nome
    }

}

fun main(){
    val joao = GetSets()
    println(joao.nome)
    joao.nome = "Vinicius"
    println(joao.nome)

}