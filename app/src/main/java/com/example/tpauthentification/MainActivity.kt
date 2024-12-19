package com.example.tpauthentification

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoImageView = findViewById<ImageView>(R.id.logoImageView)
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val errorTextView = findViewById<TextView>(R.id.errorTextView)

        val correctUsername = "youneslaggoun"
        val correctPassword = "1234"

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == correctUsername && password == correctPassword) {
                errorTextView.visibility = TextView.VISIBLE
                errorTextView.text = "Connexion réussie !"
                errorTextView.setTextColor(getColor(R.color.dark))
                logoImageView.setImageResource(R.drawable.logo)
            } else {
                errorTextView.visibility = TextView.VISIBLE
                errorTextView.text = "Nom d'utilisateur ou mot de passe incorrect"
                errorTextView.setTextColor(getColor(R.color.white))
            }
        }
    }
}
