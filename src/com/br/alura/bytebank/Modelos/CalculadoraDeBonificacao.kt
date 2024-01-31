package br.com.alura.bytebank.Modelos

/*Classe para calcular a bonificação de cada funcionario, sendo que
cada um recebe a bonificação de acordo com o salário e função!*/
class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}