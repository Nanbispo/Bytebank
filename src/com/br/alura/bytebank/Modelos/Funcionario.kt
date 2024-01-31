package br.com.alura.bytebank.Modelos

//Classe abstrata MÃE onde os funcionários especificos herdarão dela
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    abstract val bonificacao: Double


}