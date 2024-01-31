package com.br.alura.bytebank.Modelos
import br.com.alura.bytebank.Modelos.Cliente

/*Classe pai que herda algumas funções da classe mãe (Cliente),
mas é ultilizada para fazer a herança nas classes de conta corrente e poupança!
Ela é abstrata para que suas properts não sejam acessadas diretamente e facilmente
por quesitos de segurança.*/
abstract class Conta(
    var titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set
    companion object{
       var total = 0
           private set
    }

    //Função de depositar valores
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    //Função de sacar valores
    abstract fun saca(valor: Double)


    //Função de transferir valores de uma conta para outra
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

//Classe filha utilizada para um tipo especifico de conta (neste caso a conta CORRENTE)
class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}


//Classe filha utilizada para um tipo especifico de conta (neste caso a conta POUPANÇA)
class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}