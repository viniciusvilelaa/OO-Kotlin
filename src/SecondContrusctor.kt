class SecondContrusctor() {
    //Propiedades
    var nome = ""
    var cpf = ""
    var dataNascimento = ""

    //Second Constructor
    //Não é permgitjido nem criar variaveis nem inicilizar variaveis com parametros no contrusctor secondario
    constructor(nome: String, cpf: String, dataNascimento: String): this(){
        this.nome = nome
        this.cpf = cpf
        this.dataNascimento = dataNascimento
    }

    //Metodos

    fun andar(){
        println("Pessoa Andando")
    }

    fun comer(){
        println("Pessoa Comendo")
    }

    fun falar(){
        println("Pessoa Falando")
    }

}