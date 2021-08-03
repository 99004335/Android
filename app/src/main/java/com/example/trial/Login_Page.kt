package com.example.trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        getSupportActionBar()?.setTitle("Login page")
    }
}