package br.com.alura.bytebank.Testes

import br.com.alura.bytebank.Modelos.Cliente
import com.br.alura.bytebank.Modelos.ContaCorrente
import com.br.alura.bytebank.Modelos.ContaPoupanca


fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("", "", senha = 1)
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular = joao

    val maria = Cliente("", "", senha = 1)
    var contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular = maria
    contaJoao.titular = maria

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}