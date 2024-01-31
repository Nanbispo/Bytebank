package br.com.alura.bytebank.teste

import br.com.alura.bytebank.Modelos.Autenticavel
import br.com.alura.bytebank.Modelos.Cliente
import br.com.alura.bytebank.Modelos.SistemaInterno
import br.com.alura.bytebank.modelo.*
import com.br.alura.bytebank.Modelos.Conta
import com.br.alura.bytebank.Modelos.ContaCorrente
import com.br.alura.bytebank.Modelos.ContaPoupanca

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    println("Total de contas: ${Conta.total}")
}