package br.com.alura.bytebank.modelo


/*Classe para uma propriedade da conta, no caso o endereço*/
class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
)