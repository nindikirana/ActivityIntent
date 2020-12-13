package com.nindikiranaf.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_warna.*

class WarnaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warna)

        buttonMerah.setOnClickListener(this)
        buttonBiru.setOnClickListener(this)
        buttonHijau.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val button = v as Button
        val warna = button.text

        val result = Intent()
        result.putExtra("WARNA", warna)
        setResult(55,result)
        finish()
    }
}