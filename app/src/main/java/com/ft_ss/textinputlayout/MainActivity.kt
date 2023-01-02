package com.ft_ss.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun setupTextInputLayout() {
        binding.submit.setOnClickListener {
            val username = binding.username.text.toString()
            val password = findViewById<TextInputEditText>().Hasło.text.toString()

            Toast.makeText(
                applicationContext,
                "Username: $username, Password: $password", Toast.LENGTH_SHORT
            ).show()
        }
    }
}