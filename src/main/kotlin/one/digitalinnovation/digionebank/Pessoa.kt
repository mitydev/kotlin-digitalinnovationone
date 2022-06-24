package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Michael";

    var cpf: String = "123.123.123-11"
    private set;

    constructor(){
        println("Chamando construct");
    }

    fun info() = "$nome e $cpf";
}

fun main(){
    val pessoa = Pessoa();

    println(pessoa.nome);
    println(pessoa.cpf);
    println(pessoa.info());
}