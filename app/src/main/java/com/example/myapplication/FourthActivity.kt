package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var ageTextView: TextView
    private lateinit var emailTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth);

        nameTextView = findViewById(R.id.name);
        ageTextView = findViewById(R.id.age);
        emailTextView = findViewById(R.id.email);

        nameTextView.text = intent.extras?.getString("NAME")
        ageTextView.text = intent.extras?.getInt("AGE").toString()
        emailTextView.text = intent.extras?.getString("EMAIL");


    }
}