package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main() {
    val cli = Cliente("José da Silva", "10582906903", ClienteTipo.PF, "123452")


    println(cli.toString());
    TestaAutenticacao().autentica(cli);
}