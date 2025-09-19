package com.example.primeiro_codigo_em_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var resultadoAtual: Double? = null
    private var operacao: Char? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val resultado = findViewById<TextView>(R.id.resultado)

        val btnSoma = findViewById<Button>(R.id.btnSoma)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnIgual = findViewById<Button>(R.id.btnIgual)

        // Operações
        btnSoma.setOnClickListener { operacao = '+' }
        btnSubtrair.setOnClickListener { operacao = '-' }
        btnMultiplicar.setOnClickListener { operacao = '*' }
        btnDividir.setOnClickListener { operacao = '/' }

        // Quando clicar em "="
        btnIgual.setOnClickListener {
            val n1 = numero1.text.toString().toDoubleOrNull()
            val n2 = numero2.text.toString().toDoubleOrNull()

            if (n1 == null || n2 == null) {
                Toast.makeText(this, "Digite os dois números!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val res = when (operacao) {
                '+' -> n1 + n2
                '-' -> n1 - n2
                '*' -> n1 * n2
                '/' -> if (n2 != 0.0) n1 / n2 else Double.NaN
                else -> null
            }

            resultado.text = if (res != null) "Resultado: $res" else "Escolha uma operação"
        }
    }
}