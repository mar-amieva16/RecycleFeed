package com.lharo.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRecycledFeed=findViewById<Button>(R.id.boton_feed)

        btnRecycledFeed.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent =when(view.id){
            R.id.boton_feed->Intent(this, MoviesActivity::class.java)
            else->throw IllegalArgumentException("Invalid Button")
        }
        startActivity(intent)
    }
}