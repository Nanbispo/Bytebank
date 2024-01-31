package br.com.alura.bytebank.Testes

import br.com.alura.bytebank.Modelos.Cliente
import com.br.alura.bytebank.Modelos.ContaCorrente
import com.br.alura.bytebank.Modelos.ContaPoupanca


fun testaContasDiferentes() {
    val alex = Cliente("", "", senha = 1)
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    val fran = Cliente("", "", senha = 1)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}