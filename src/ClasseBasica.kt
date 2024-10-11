class ClasseBasica(nome: String, cpf: String, dataNascimento: String) {
    //Propiedades
    var nome = ""
    var cpf = ""
    var dataNascimento = ""

    //Contrusctor
    init {
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