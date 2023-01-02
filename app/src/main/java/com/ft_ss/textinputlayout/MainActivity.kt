package com.ft_ss.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<TextInputEditText>(R.id.Imie).text.toString()
        val Nick = findViewById<TextInputEditText>(R.id.Nick).text.toString()

            findViewById<Button>(R.id.Sprawdź).setOnClickListener {
                var password = findViewById<TextInputEditText>(R.id.Hasło).text.toString()
                var potwierdź = findViewById<TextInputEditText>(R.id.Potwierdź).text.toString()
                if (password == potwierdź){
                    findViewById<TextView>(R.id.textView).text = "Hasła: Zgodne"}
                else {
                    findViewById<TextView>(R.id.textView).text = " Hasła: Niezgodne"}
        }
    }
}