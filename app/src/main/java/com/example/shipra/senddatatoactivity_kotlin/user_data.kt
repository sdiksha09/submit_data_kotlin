package com.example.shipra.senddatatoactivity_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user_data.*

class user_data : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)

        //get data from intent
        var intent =intent
        var uName= intent.getStringExtra("username")
        var pass=intent.getStringExtra("password")
        //textview
        val resultTv=findViewById<TextView>(R.id.display_data)


        //set text
        resultTv.text="User Name: "+uName+"\nPassword:"+pass





        /*
           Intent in = getIntent();
        Bundle b = in.getExtras();
        String username = b.getString("username");
                                                               //java code

        TextView tv = (TextView) findViewById(R.id.user_profile);
        tv.setText("Welcome../t/t"+username+"/t/t this is your profile");
         */
    }
}
