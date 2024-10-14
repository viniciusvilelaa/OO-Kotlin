//Permite que declare métodos e propiedades que devem ser implementados pelas classes
//Diferente de outras linguagens em kotlin é possivel implementar metodos na interface

interface Selvagem{
    fun atacar()
    fun cacar()
    var categoria:String

    fun dormindo(){
        println("Selvagem está dormindo")
    }

}

abstract class AnimalMamifero{
    fun amamentar(){
        println("Amamentando")
    }
}

class Leao : AnimalMamifero(), Selvagem{
    override fun atacar() {
        println("Leão atacando")
    }

    override fun cacar() {
        println("Leão caçando")
    }

    override var categoria: String = "Felinos"

}

fun main(){
    var toin = Leao()
    toin.dormindo()
    toin.amamentar()
    toin.atacar()
    toin.cacar()
    print(toin.categoria)

}