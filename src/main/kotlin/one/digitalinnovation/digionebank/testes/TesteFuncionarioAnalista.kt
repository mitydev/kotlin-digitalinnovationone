package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Relatorios

fun main() {
   val func = Analista("Michael Tiago Barroso", "10582906903", 2819.80);

   Relatorios.printRelatorio(func);
}
