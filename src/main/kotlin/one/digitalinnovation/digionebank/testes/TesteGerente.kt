package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Relatorios

fun main() {
    val func = Gerente("Anna Pierina Patriarca Piccini", "01273966910", 4000.00);
    Relatorios.printRelatorio(func);
}