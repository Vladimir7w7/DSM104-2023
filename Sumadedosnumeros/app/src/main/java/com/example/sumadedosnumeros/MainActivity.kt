package com.example.sumadedosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1=findViewById<EditText>(R.id.txtn1)
        val n2=findViewById<EditText>(R.id.txtn2)
        val r = findViewById<TextView>(R.id.lbln3)
        val btnsumar = findViewById<Button>(R.id.btnsumar)

        btnsumar.setOnClickListener {
            r.setText(
                "La SUMA es: "+(n1.text.toString().toInt()+n2.text.toString().toInt())
            )
        }
    }
}