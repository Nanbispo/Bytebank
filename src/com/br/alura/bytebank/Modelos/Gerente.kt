package br.com.alura.bytebank.Modelos

/*Classe filha do funcionário GERENTE, que herda da classe PAI (funcionarioAdmin) que herda da classe MÃE (funcionario)*/
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }

}