package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double

): Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio() = salario*0.11
    override fun salarioTotal(): Double {
        return salario + calculaAuxilio()
    }

}