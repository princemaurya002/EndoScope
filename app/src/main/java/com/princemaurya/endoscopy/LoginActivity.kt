package com.princemaurya.endoscopy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var createacbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        btn = findViewById(R.id.loginbtn);
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java);
            startActivity(Intent)
        }

        createacbtn=findViewById(R.id.createacbtn)
        createacbtn.setOnClickListener(){
            val Intent=Intent(this,SignUpActivity::class.java)
            startActivity(Intent)
        }

    }
}