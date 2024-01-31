package br.com.alura.bytebank.Modelos

//Classe mãe para armazenar os dados do Cliente
class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
    //Chamada da Interface Autenticavel para acesso ao sistema
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}