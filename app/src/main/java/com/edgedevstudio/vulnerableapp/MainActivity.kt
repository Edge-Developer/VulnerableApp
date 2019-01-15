package com.edgedevstudio.vulnerableapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var i = 0
    private lateinit var btn: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.crackMe)
        btn.setOnClickListener({ v ->
            setOutput(i)
        })
    }

    private fun setOutput(i : Int){
        if (i==1)
            Toast.makeText(this, "Crack Successful", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "Not Cracked. You can not crack it!", Toast.LENGTH_LONG).show()
    }
}
