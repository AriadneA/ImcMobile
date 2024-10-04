package com.example.imcprojeto2ai.Utilidade

import android.content.Context
import android.widget.Toast

class Util {
    companion object{
     fun ExibirMensagemToast(context: Context, mensagem:String){
         Toast.makeText(context,mensagem, Toast.LENGTH_LONG).show()
     }
    }
}