class person(val nome:String, var idade: Int, var dataNasc: String){
    fun andar(){
        println("Pessoa Andando")
    }


}

fun main(){
    val pessoa = person("Vinicius",21, "101010")

    with(pessoa){
        andar()
        println("Nome: $nome")
        println("Idade: $idade")
        println("Nascimento: $dataNasc")

        idade += 1
        dataNasc = "Teste"

        println(idade)
    }



}