//A classe precisa ter a propiedade open para que outras possam herdar

open class Herança {
    open fun emitirSom(){
        println("Animal emitindo som")
    }
}

class cachorro : Herança(){
    //Para conseguir reescrever algum metodo da classe mãe é necessario colocar override
    override fun emitirSom(){
        println("Cachorro latindo")
    }
}

fun main(){
    var cachorro = cachorro()
    cachorro.emitirSom()
}