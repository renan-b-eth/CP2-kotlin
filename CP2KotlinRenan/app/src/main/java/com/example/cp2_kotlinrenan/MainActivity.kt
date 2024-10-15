package com.example.cp2_kotlinrenan

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
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

        val items = listOf("CRIPTCOS", "RENDEY LLC", "PRAETOR LLC")

        // Criar um ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        // Configurar o Spinner
        val spinner = findViewById<Spinner>(R.id.spinner1)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(
                    this@MainActivity,
                    "Você selecionou: $selectedItem", Toast.LENGTH_SHORT
                ).show()


                val edt1 = findViewById<EditText>(R.id.editTextText)
                val botao = findViewById<Button>(R.id.button)
                val edt2 = findViewById<TextView>(R.id.textView)

                botao.setOnClickListener {
                    val
                            text = edt1.text.toString()
                    edt2.text = "Você digitou: $text"
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
    }
}
