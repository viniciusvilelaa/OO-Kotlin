class person(val nome:String, val cpf: String, val dataNasc: String){
    fun andar(){
        println("Pessoa Andando")
    }


}

fun main(){
    val pessoa = person("Vinicius","123123", "101010")

    with(pessoa){
        
    }

}