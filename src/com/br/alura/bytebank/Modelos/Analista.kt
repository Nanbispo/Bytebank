package br.com.alura.bytebank.Modelos
//Classe simples que herda de uma classe mãe principal -> (Funcionario)
class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
/*Sobre-escrita feita para herdar uma função de bonificação*/
    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}