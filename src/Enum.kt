//
enum class Enum (val id: Int){
    Alta(1),Media(2),Baixa(3)
}

fun main(){
    var prioridade = Enum.Media
    println(prioridade.id)
}