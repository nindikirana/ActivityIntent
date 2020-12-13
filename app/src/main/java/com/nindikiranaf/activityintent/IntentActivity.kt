package com.nindikiranaf.activityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val nohp = intent.getStringExtra("DATA")
        Toast.makeText(this, nohp,Toast.LENGTH_SHORT).show()
    }
}