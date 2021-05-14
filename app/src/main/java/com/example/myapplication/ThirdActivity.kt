package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var ageTextView: TextView
    private lateinit var finalButton: Button;
    private lateinit var emailEditText: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        nameTextView = findViewById(R.id.textView)
        ageTextView = findViewById(R.id.textView2)
        emailEditText = findViewById(R.id.emailEditText)
        finalButton = findViewById(R.id.finalButton);
        val name = intent.extras?.getString("NAME")
        val age = intent.extras?.getString("AGE")
        nameTextView.text = intent.extras?.getString("NAME")
        ageTextView.text = intent.extras?.getInt("AGE").toString()
        finalButton.setOnClickListener {
            val emailText: String = emailEditText.text.toString()
            if (emailText.isEmpty())
                return@setOnClickListener

            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("NAME",name).putExtra("AGE",age).putExtra("EMAIL",emailText)
            startActivity(intent)
        }

    }
}