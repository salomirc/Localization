package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doSomethingButton.setOnClickListener {
            val message = Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT)
            message.setGravity(Gravity.TOP,0, 0)
            message.show()
        }
    }
}
