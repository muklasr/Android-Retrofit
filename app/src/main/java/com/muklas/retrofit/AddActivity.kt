package com.muklas.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        btnSave.setOnClickListener{
            val title = etTitle.text.toString()
            val image = etImage.text.toString()
        }
    }
}