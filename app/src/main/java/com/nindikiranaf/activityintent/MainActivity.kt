package com.nindikiranaf.activityintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity","===============Open===============")
        Log.e("MainActivity","onCreate")
        setContentView(R.layout.activity_main)



        buttonIntentActivity.setOnClickListener {
            val intent = Intent(MainActivity@this, IntentActivity::class.java)
            //explicit intent
            intent.putExtra("DATA","087747831445")
            startActivity(intent)
        }

        buttonDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:087747831445"))
            startActivity(intent)
        }

        buttonPilihWarna.setOnClickListener {
            val intent = Intent(MainActivity@this, WarnaActivity::class.java)
            startActivityForResult(intent,50)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 50 && resultCode == 55){
            val warna = data?.getStringExtra("WARNA")
            textHasil.text = warna
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
        Log.e("MainActivity","===============Running===============")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
        Log.e("MainActivity","===============Closed===============")
    }
}