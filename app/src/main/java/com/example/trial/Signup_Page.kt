package com.example.trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Signup_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)
        getSupportActionBar()?.setTitle("SignUp page")
    }
}