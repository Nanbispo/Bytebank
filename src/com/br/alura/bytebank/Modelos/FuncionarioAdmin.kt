package br.com.alura.bytebank.Modelos


//Classe PAI que herda da classe MÃE (funcionario) para tipos de funcionarios mais especificos
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    //Autenticação feita utilizando a interface
    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}