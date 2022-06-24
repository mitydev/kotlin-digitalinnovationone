package one.digitalinnovation.digionebank

class Gerente(nome:String,cpf:String, salario:Double, val senha: String) :Funcionario(nome, cpf, salario), Logavel {

    override fun calculaAuxilio(): Double {
        return salario * 0.4
    }
    override fun salarioTotal(): Double {
        return salario + calculaAuxilio()
    }

    override fun login(): Boolean = senha == "senha123"
}