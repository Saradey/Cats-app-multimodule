package com.example.testuikit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kit.*

class KitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kit)
        btnTestProgress.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frmField, ProgressCatFragment())
                .addToBackStack(ProgressCatFragment::class.java.name)
                .commit()
        }
    }

    override fun onBackPressed() {
        supportFragmentManager.popBackStack()
    }
}
