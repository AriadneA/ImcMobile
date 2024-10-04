package com.example.imcprojeto2ai.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.imcprojeto2ai.R
import com.example.imcprojeto2ai.databinding.ActivityDadosBinding


class Dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bin = ActivityDadosBinding.inflate(layoutInflater)
        setContentView(bin.root)

        bin.btvoltar2.setOnClickListener {
            var voltar = Intent(this, Cadastroo::class.java)
            startActivity(voltar)
            finish()
        }
        var nome = intent.getStringExtra("nome")
        bin.edtnome.text = nome

        var idade = intent.getStringExtra("idade")
        bin.edtidade.text = idade

        var imc = intent.getStringExtra("imc")
        bin.edtimc.text = imc

        var altura = intent.getStringExtra("altura")

        //PESO IDEAL
        if (altura.toString().toFloat() < 1.45) {
            var textView = findViewById<TextView>(R.id.edtpesoideal)
            textView.text = "37,8 a 52,5 kg"
            var textViewString = textView.text.toString()
        } else {
            if (altura.toString().toFloat() < 1.47) {
                var textView = findViewById<TextView>(R.id.edtpesoideal)
                textView.text = "38,8 a 54,0 kg"
                var textViewString = textView.text.toString()
            } else {
                if (altura.toString().toFloat() < 1.49) {
                    var textView = findViewById<TextView>(R.id.edtpesoideal)
                    textView.text = "39,9 a 55,5 kg"
                    var textViewString = textView.text.toString()
                } else {
                    if (altura.toString().toFloat() < 1.51) {
                        var textView = findViewById<TextView>(R.id.edtpesoideal)
                        textView.text = "41,0 a 57,0 kg"
                        var textViewString = textView.text.toString()
                    } else {
                        if (altura.toString().toFloat() < 1.53) {
                            var textView = findViewById<TextView>(R.id.edtpesoideal)
                            textView.text = "42,1 a 58,5 kg"
                            var textViewString = textView.text.toString()
                        } else {
                            if (altura.toString().toFloat() < 1.55) {
                                var textView = findViewById<TextView>(R.id.edtpesoideal)
                                textView.text = "43,3 a 60,5 kg"
                                var textViewString = textView.text.toString()
                            } else {
                                if (altura.toString().toFloat() < 1.57) {
                                    var textView = findViewById<TextView>(R.id.edtpesoideal)
                                    textView.text = "44,4 a 61,6 kg"
                                    var textViewString = textView.text.toString()
                                } else {
                                    if (altura.toString().toFloat() < 1.59) {
                                        var textView = findViewById<TextView>(R.id.edtpesoideal)
                                        textView.text = "45,5 a 63,2 kg"
                                        var textViewString = textView.text.toString()
                                    } else {
                                        if (altura.toString().toFloat() < 1.61) {
                                            var textView = findViewById<TextView>(R.id.edtpesoideal)
                                            textView.text = "46,7 a 64,8 kg"
                                            var textViewString = textView.text.toString()
                                        } else {
                                            if (altura.toString().toFloat() < 1.63) {
                                                var textView =
                                                        findViewById<TextView>(R.id.edtpesoideal)
                                                textView.text = "48,7 a 66,4 kg"
                                                var textViewString = textView.text.toString()
                                            } else {
                                                if (altura.toString().toFloat() < 1.65) {
                                                    var textView =
                                                            findViewById<TextView>(R.id.edtpesoideal)
                                                    textView.text = "49,0 a 68,0 kg"
                                                    var textViewString = textView.text.toString()
                                                } else {
                                                    if (altura.toString().toFloat() < 1.67) {
                                                        var textView =
                                                                findViewById<TextView>(R.id.edtpesoideal)
                                                        textView.text = "50,2 a 69,7 kg"
                                                        var textViewString =
                                                                textView.text.toString()
                                                    } else {
                                                        if (altura.toString().toFloat() < 1.67) {
                                                            var textView =
                                                                    findViewById<TextView>(R.id.edtpesoideal)
                                                            textView.text = "50,2 a 69,7 kg"
                                                            var textViewString =
                                                                    textView.text.toString()
                                                        } else {
                                                            if (altura.toString()
                                                                            .toFloat() < 1.69
                                                            ) {
                                                                var textView =
                                                                        findViewById<TextView>(R.id.edtpesoideal)
                                                                textView.text = "51,4 a 71,4 kg"
                                                                var textViewString =
                                                                        textView.text.toString()
                                                            } else {
                                                                if (altura.toString()
                                                                                .toFloat() < 1.71
                                                                ) {
                                                                    var textView =
                                                                            findViewById<TextView>(R.id.edtpesoideal)
                                                                    textView.text = "52,6 a 73,1 kg"
                                                                    var textViewString =
                                                                            textView.text.toString()
                                                                } else {
                                                                    if (altura.toString()
                                                                                    .toFloat() < 1.73
                                                                    ) {
                                                                        var textView =
                                                                                findViewById<TextView>(R.id.edtpesoideal)
                                                                        textView.text =
                                                                                "53,9 a 74,8 kg"
                                                                        var textViewString =
                                                                                textView.text.toString()
                                                                    } else {
                                                                        if (altura.toString()
                                                                                        .toFloat() < 1.75
                                                                        ) {
                                                                            var textView =
                                                                                    findViewById<TextView>(
                                                                                            R.id.edtpesoideal
                                                                                    )
                                                                            textView.text =
                                                                                    "55,1 a 78,3 kg"
                                                                            var textViewString =
                                                                                    textView.text.toString()
                                                                        } else {
                                                                            if (altura.toString()
                                                                                            .toFloat() < 1.77
                                                                            ) {
                                                                                var textView =
                                                                                        findViewById<TextView>(
                                                                                                R.id.edtpesoideal
                                                                                        )
                                                                                textView.text =
                                                                                        "57,7 a 80,1 kg"
                                                                                var textViewString =
                                                                                        textView.text.toString()
                                                                            } else {
                                                                                if (altura.toString()
                                                                                                .toFloat() < 1.79
                                                                                ) {
                                                                                    var textView =
                                                                                            findViewById<TextView>(
                                                                                                    R.id.edtpesoideal
                                                                                            )
                                                                                    textView.text =
                                                                                            "59,0 a 80,1 kg"
                                                                                    var textViewString =
                                                                                            textView.text.toString()
                                                                                } else {
                                                                                    if (altura.toString()
                                                                                                    .toFloat() < 1.81
                                                                                    ) {
                                                                                        var textView =
                                                                                                findViewById<TextView>(
                                                                                                        R.id.edtpesoideal
                                                                                                )
                                                                                        textView.text =
                                                                                                "60,3 a 83,7 kg"
                                                                                        var textViewString =
                                                                                                textView.text.toString()
                                                                                    } else {
                                                                                        if (altura.toString()
                                                                                                        .toFloat() < 1.83
                                                                                        ) {
                                                                                            var textView =
                                                                                                    findViewById<TextView>(
                                                                                                            R.id.edtpesoideal
                                                                                                    )
                                                                                            textView.text =
                                                                                                    "61,6 a 85,5 kg"
                                                                                            var textViewString =
                                                                                                    textView.text.toString()
                                                                                        } else {
                                                                                            if (altura.toString()
                                                                                                            .toFloat() < 1.85
                                                                                            ) {
                                                                                                var textView =
                                                                                                        findViewById<TextView>(
                                                                                                                R.id.edtpesoideal
                                                                                                        )
                                                                                                textView.text =
                                                                                                        "63,0 a 87,1 kg"
                                                                                                var textViewString =
                                                                                                        textView.text.toString()
                                                                                            } else {
                                                                                                if (altura.toString()
                                                                                                                .toFloat() < 1.87
                                                                                                ) {
                                                                                                    var textView =
                                                                                                            findViewById<TextView>(
                                                                                                                    R.id.edtpesoideal
                                                                                                            )
                                                                                                    textView.text =
                                                                                                            "64,3 a 89,3 kg"
                                                                                                    var textViewString =
                                                                                                            textView.text.toString()
                                                                                                } else {
                                                                                                    if (altura.toString()
                                                                                                                    .toFloat() < 1.91
                                                                                                    ) {
                                                                                                        var textView =
                                                                                                                findViewById<TextView>(
                                                                                                                        R.id.edtpesoideal
                                                                                                                )
                                                                                                        textView.text =
                                                                                                                "65,7 a 91,2 kg"
                                                                                                        var textViewString =
                                                                                                                textView.text.toString()
                                                                                                    }
                                                                                                }

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                //IMC
                if (imc.toString().toFloat() < 18.5) {
                    var textView = findViewById<TextView>(R.id.edtclassificaçao)
                    textView.text = "Baixo peso"
                    var textViewString = textView.text.toString()


                } else {
                    if (imc.toString()
                                    .toFloat() < 25
                    ) {
                        var textView =
                                findViewById<TextView>(
                                        R.id.edtclassificaçao
                                )
                        textView.text =
                                "Normal"
                        var textViewString =
                                textView.text.toString()
                    } else {
                        if (imc.toString()
                                        .toDouble() < 30
                        ) {
                            var textView =
                                    findViewById<TextView>(
                                            R.id.edtclassificaçao
                                    )
                            textView.text =
                                    "Sobrepeso"
                            var textViewString =
                                    textView.text.toString()
                        } else {
                            if (imc.toString()
                                            .toFloat() < 40
                            ) {
                                var textView =
                                        findViewById<TextView>(
                                                R.id.edtclassificaçao
                                        )
                                textView.text =
                                        "Obesidade"
                                var textViewString =
                                        textView.text.toString()
                            } else {

                                var textView =
                                        findViewById<TextView>(
                                                R.id.edtclassificaçao
                                        )
                                textView.text =
                                        "Obesidade grave"
                                var textViewString =
                                        textView.text.toString()
                            }
                        }
                    }
                }
            }
        }
    }
}


