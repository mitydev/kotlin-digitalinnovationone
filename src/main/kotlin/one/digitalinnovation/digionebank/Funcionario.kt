package one.digitalinnovation.digionebank

import java.math.BigDecimal


abstract class Funcionario(
    nome:String,
    cpf: String,
    var salario:Double
) : Pessoa(nome,cpf) {
    protected abstract fun calculaAuxilio():Double;
    protected abstract fun salarioTotal():Double;

    override fun toString(): String {
        return "Nome: ${nome} \nCPF: ${cpf} \nSalario: ${salario} \nAuxilio: ${calculaAuxilio()} \nTotal: ${salarioTotal()}"
    }
}
