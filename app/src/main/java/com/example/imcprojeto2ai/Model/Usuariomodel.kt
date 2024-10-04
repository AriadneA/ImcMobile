package com.example.imcprojeto2ai.Model

class Usuariomodel {
    var login : String?
    var senha : Int?

    constructor(){
        this.login = null
        this.senha = null
    }
    constructor(login:String, senha:Int){
        this.login = login
        this.senha = senha
    }

}//fim main