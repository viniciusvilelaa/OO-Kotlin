//Modificador lateint é usado para declarar variaveis que serão instanciadas posteriormente
//Funciona apenas variaveis do tipo VAR


class LateInt {
    lateinit var nome: String

    fun recebeNome(nome: String){
        this.nome = nome
    }

    fun imprimeNome(){
        if(this::nome.isInitialized){
            println("Nome da pessoa é $nome")
        } else{
            println("Nome não fornecido")
        }
    }

}

fun main(){
    var lateInt: LateInt = LateInt()
    with(lateInt){
        imprimeNome()
        recebeNome("Vinicius")
        imprimeNome()
    }
}


