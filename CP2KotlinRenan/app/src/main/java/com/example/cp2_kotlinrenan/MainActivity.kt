package com.example.cp2_kotlinrenan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edt1 = findViewById<EditText>(R.id.editTextText)
        val botao = findViewById<Button>(R.id.button)
        val edt2 = findViewById<TextView>(R.id.textView)

        botao.setOnClickListener {
            val
            text = edt1.text.toString()
            edt2.text = "Você digitou: $text"
        }
    }


}
