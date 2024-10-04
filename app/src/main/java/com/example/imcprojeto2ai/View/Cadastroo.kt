package com.example.imcprojeto2ai.View


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imcprojeto2ai.databinding.ActivityCadastrooBinding


class Cadastroo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityCadastrooBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btvoltar.setOnClickListener {
            var voltar = Intent(this, LoginActivity::class.java)
            startActivity(voltar)
        }
        bind.btcalcular.setOnClickListener {
            var calcular = Intent(this, Dados::class.java)
            calcular.putExtra("nome", bind.edtnome.text.toString())
            calcular.putExtra("idade", (2021 - bind.edtAN.text.toString().toInt()).toString())
            calcular.putExtra("peso", bind.edtpeso.text.toString())
            calcular.putExtra("altura", bind.edtaltura.text.toString())


            var imc = (bind.edtpeso.text.toString().toFloat()) / (bind.edtaltura.text.toString()
                    .toFloat() * bind.edtaltura.text.toString().toFloat())

            calcular.putExtra("imc",imc.toString())
            startActivity(calcular)
            finish()
        }


    }
}

