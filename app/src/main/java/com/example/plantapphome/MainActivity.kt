package com.example.plantapphome

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var btnHamburger: ImageButton
    lateinit var scanButton: ImageButton
    lateinit var uploadButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btnHamburger = findViewById(R.id.imageButton3)

         btnHamburger.setOnClickListener(View.OnClickListener {

             Toast.makeText(this@MainActivity, "the button works!", Toast.LENGTH_SHORT).show()

         })


        scanButton = imageButton5

        scanButton.setOnClickListener(View.OnClickListener {

            Toast.makeText(this@MainActivity, "Scan flowers!", Toast.LENGTH_SHORT).show()

        })

        uploadButton = imageButton6

        uploadButton.setOnClickListener(View.OnClickListener {

            Toast.makeText(this@MainActivity, "Upload a photo!", Toast.LENGTH_SHORT).show()

        })


    }
}
