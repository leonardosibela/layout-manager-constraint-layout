package com.example.constraintlayout

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {

    private lateinit var styleGroup: Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.clickmeButton).setOnClickListener { onClickMeClicked() }
        styleGroup = findViewById(R.id.styleGroup)
    }

    private fun onClickMeClicked() {
        if (styleGroup.visibility == View.INVISIBLE) {
            styleGroup.visibility = View.VISIBLE
        } else {
            styleGroup.visibility = View.INVISIBLE
        }
    }
}