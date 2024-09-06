package com.fernando.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var editPrimeiroNum:TextInputEditText = findViewById(R.id.editPrimeiroNum)
        var editSegundoNum:TextInputEditText = findViewById(R.id.editSegundoNum)
        var txtResultado:TextView = findViewById(R.id.txtResultado)
        var btnSomar:Button = findViewById(R.id.btnSomar)
        var imgMultiplicar:ImageView = findViewById(R.id.imgMulti)

        btnSomar.setOnClickListener{
            var primeiroNumero = editPrimeiroNum.text.toString().toDouble()
            var segundoNumero = editSegundoNum.text.toString().toDouble()
            var resultado = primeiroNumero+segundoNumero

            txtResultado.setText("Resultado da Soma:${resultado}")
        }

        imgMultiplicar.setOnClickListener{
            var primeiroNumero = editPrimeiroNum.text.toString().toDouble()
            var segundoNumero = editSegundoNum.text.toString().toDouble()
            var resultado = primeiroNumero*segundoNumero

            txtResultado.setText("Resultado da Multiplicação:${resultado}")
        }




    }
}