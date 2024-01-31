package br.com.alura.bytebank.Modelos


/*Sistema de autenticação que busca na interface autenticavel
e faz a verificação para saber se existe registro ou não do cliente
ou funcionário que está tentando acessar o sistema*/
class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}