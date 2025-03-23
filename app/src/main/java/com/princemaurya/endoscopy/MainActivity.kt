package com.princemaurya.endoscopy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button;
    lateinit var btn2:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.startCameraButton);
        btn.setOnClickListener {
            val Intent = Intent(this, CameraActivity::class.java);
            startActivity(Intent)
        }

        btn2 = findViewById(R.id.usbCamerabtn);
        btn2.setOnClickListener {
            val Intent = Intent(this, USBCamerafeed::class.java);
            startActivity(Intent)
        }

    }
}