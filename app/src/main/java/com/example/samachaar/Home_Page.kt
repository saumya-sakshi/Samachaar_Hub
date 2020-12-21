package com.example.samachaar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home_Page : AppCompatActivity() {
    lateinit var btop:Button
    lateinit var bSci:Button
    lateinit var bSport:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home__page)
        btop=findViewById(R.id.topHead)
        bSci=findViewById(R.id.Science)
        bSport=findViewById(R.id.Sports)

    }

    fun topHeaddline(view: View) {
        val intent = Intent(this, top_headline::class.java)
        startActivity(intent)
    }
    fun sciencePage(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun sportsPage(view: View) {
        val intent = Intent(this, sports_section::class.java)
        startActivity(intent)
    }


}