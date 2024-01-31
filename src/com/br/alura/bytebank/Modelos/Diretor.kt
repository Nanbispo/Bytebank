package com.br.alura.bytebank.Modelos
import br.com.alura.bytebank.Modelos.FuncionarioAdmin

/*Classe filha do funcionário DIRETOR, que herda da classe PAI (funcionarioAdmin) que herda da classe MÃE (funcionario)*/
class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

}