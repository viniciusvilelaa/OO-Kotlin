data class DataClass(var a: Int, var b: Int) {

}

data class Endereco(var rua:String, var bairro:String, var cidade: String)
data class Pessoal(var nome:String, var cpf:String, var dataNasc: String)

class Cadastro(var endereco: Endereco, var pessoal: Pessoal)


fun main(){
    var classe1 = DataClass(10,20)
    var classe2 = DataClass(10,20)
    println(classe2.equals(classe1))

    var endereco = Endereco("Gameleira", "Cidade Verde", "Natal")
    var pessoal = Pessoal("Vinicius", "203923409", "101010")



    var cadastroPessoa = Cadastro(endereco, pessoal)
    println(cadastroPessoa.pessoal.nome)
}