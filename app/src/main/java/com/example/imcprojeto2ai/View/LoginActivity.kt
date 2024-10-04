package com.example.imcprojeto2ai.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.imcprojeto2ai.Presenter.Banco.ConfiguracaoBanco
import com.example.imcprojeto2ai.Utilidade.Util
import com.example.imcprojeto2ai.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bin = ActivityLoginBinding.inflate(layoutInflater)
        var bd = ConfiguracaoBanco.getconexaousuario()
        setContentView(bin.root)
        bin.btcriarconta.setOnClickListener {
            var intent = Intent(this, CadastrarUsuarioActivity::class.java)
            startActivity(intent)
            finish()
        }

        bin.btlogar.setOnClickListener{
            bd.signInWithEmailAndPassword(bin.edtlogin.text.toString(),bin.edtsenha.text.toString())
                .addOnSuccessListener {  sucesso ->
                    startActivity(Intent(this,Cadastroo::class.java))
                    Util.ExibirMensagemToast(this,"Login realizado com sucesso!")
                }.addOnFailureListener { error ->
                    Toast.makeText(this,"Email/Senha não cadastrado",Toast.LENGTH_LONG).show()
                    bin.edtlogin.text?.clear()
                    bin.edtsenha.text?.clear()
                    bin.edtlogin.requestFocus()
                }

        }//fim do botao logar

        bin.btredefinirsenha.setOnClickListener{
            startActivity(Intent(this,RedefinirSenhaActivity::class.java))

        }//fim botao redefinir senha

    }
}
