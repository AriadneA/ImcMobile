package com.example.imcprojeto2ai.Presenter

import android.content.ContentValues.TAG
import android.util.Log
import com.example.imcprojeto2ai.Model.Usuariomodel
import com.example.imcprojeto2ai.Presenter.Banco.ConfiguracaoBanco



class Usuariopresenter {
    var bd= ConfiguracaoBanco.getconexaousuario()


    fun CadastrarUsuario(user:Usuariomodel){

        bd.createUserWithEmailAndPassword(user.login.toString(),user.senha.toString())
    }//fim classe
    fun RedefinirSenha(email:String) {
        bd.sendPasswordResetEmail(email).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Log.d(TAG, "Email sent.")
            }
        }

    }

}// fim class usuario