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
                val botao = findViewById<Button>(R.id.botao1)
                val edt2 = findViewById<TextView>(R.id.textView)

                botao.setOnClickListener {
                    val text = edt1.text.toString()
                    edt2.text = "Você digitou: $text"
                }
    // parte da internacionalização
                val botaoUs = findViewById<Button>(R.id.botaoUs)
                botaoUs.setOnClickListener {
                    val edt2 = findViewById<EditText>(R.id.editTextText)
                    val edt3 = findViewById<EditText>(R.id.editTextText2)
                    val edt4 = findViewById<EditText>(R.id.editTextText3)

                    edt2.setText("Password")
                    edt3.setText("Name")
                    edt4.setText("Contact-US")
                }

            }




            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
    }
}
