package com.example.mad_practical_6_21012011158

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play : FloatingActionButton = findViewById(R.id.play_btn)
        val stop : FloatingActionButton = findViewById(R.id.stop_btn)

        play.setOnClickListener{
            playPause()
        }
        stop.setOnClickListener{
            playStop()
        }
    }
    fun playPause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PlayerVALUE).apply { startService(this) }
    }

    fun playStop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PlayerVALUE).apply { stopService(this) }
    }
}


