package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()

        txtLoginListener()
        btnBackListener()
    }
    private fun txtLoginListener(){
        txt_login.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
    private fun btnBackListener(){
        R_img_1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

}