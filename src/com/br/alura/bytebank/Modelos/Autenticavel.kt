package br.com.alura.bytebank.Modelos

/*Interface usada para criar uma função de autenticação para o
 cliente e também para o funcionário, porém não permitindo o acesso do cliente
 nas funções do funcionário!*/
interface Autenticavel {
    fun autentica(senha: Int): Boolean

}