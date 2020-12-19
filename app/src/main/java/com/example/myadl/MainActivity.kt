package com.example.myadl

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()  {

    lateinit var etEmail : EditText
    lateinit var etPass : EditText
    lateinit var btn_login : Button
    lateinit var txt_frgt : EditText
    lateinit var txt_register : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btn_login = findViewById(R.id.btn_login)
        etEmail = findViewById(R.id.etEmail)
        etPass = findViewById(R.id.etPass)

        btn_login.setOnClickListener {

            var x : Boolean = false
            var y =true
            var z = true
            if (etEmail.getText().toString().length == 0) {
                etEmail.setError("THis can't be empty!!")
                y = false
            }
            if (etPass.getText().toString().length == 0) {
                etPass.setError("THis can't be empty!!")
                z=false
            }
            if(y and z){
                x = true
            }
            if(x){
                Toast.makeText(this@MainActivity, "something is going on", Toast.LENGTH_LONG).show()
                //var indent =
                etEmail.setTextColor(Color.parseColor("#000000"))
            }
        }
    }


}