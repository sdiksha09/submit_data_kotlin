package com.example.shipra.senddatatoactivity_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user_data.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username=findViewById<EditText>(R.id.edt_username)
        val password=findViewById<EditText>(R.id.edt_password)

        submit.setOnClickListener{
            val uName=username.text.toString()
            val pass= password.text.toString()

            val intent= Intent(this,user_data::class.java)
            intent.putExtra("username",uName)
            intent.putExtra("password",pass)


           // intent.putExtra("username",display_data.text.toString())
            startActivity(intent)




        }
    }
}
