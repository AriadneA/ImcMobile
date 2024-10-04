package com.example.imcprojeto2ai.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.imcprojeto2ai.Model.Usuariomodel
import com.example.imcprojeto2ai.Presenter.Usuariopresenter
import com.example.imcprojeto2ai.databinding.ActivityCadastrarUsuarioBinding

class CadastrarUsuarioActivity : AppCompatActivity() {
    lateinit var bind: ActivityCadastrarUsuarioBinding
    var usermodel = Usuariomodel()
    var userpresenter = Usuariopresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityCadastrarUsuarioBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btcadastrar.setOnClickListener {
            if (ValidarCampos()) {
                usermodel.login = bind.edtemail.text.toString()
                usermodel.senha = bind.edtsenha.text.toString().toInt()
                userpresenter.CadastrarUsuario(usermodel)
            }else{
                Toast.makeText(this,"Preencha os campos necessarios",Toast.LENGTH_LONG).show()
            }


        }//fim do botao cadastrar
        bind.btvoltar.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }//fim metodo oncreate

    //Inicio de desenvolvimento de metodos
    fun ValidarCampos():Boolean {
        if (!bind.edtemail.text.toString().isEmpty() && !bind.edtsenha.text.toString().isEmpty()) {
            return true
        } else{
            return false
        }
    }//fim do validar campos


}//fim da classe cadastrar