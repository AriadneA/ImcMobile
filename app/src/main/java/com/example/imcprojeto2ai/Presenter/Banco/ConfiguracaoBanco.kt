package com.example.imcprojeto2ai.Presenter.Banco

import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.FirebaseAuth


class ConfiguracaoBanco {
    companion object Conexao {
        var auth = Firebase.auth
        fun getconexaousuario(): FirebaseAuth {
            if (auth==null){
                auth = Firebase.auth
                return auth
            }else{
                return auth
            }
        }
    }//fim object
}//fim configuraçao