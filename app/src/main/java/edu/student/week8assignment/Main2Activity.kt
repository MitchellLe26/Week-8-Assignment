package edu.student.week8assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val txtshow = findViewById<TextView>(R.id.txtShow)
        val btnBack = findViewById<Button>(R.id.btnBack)

        //loads intent string from MainActivity.kt

        var strShow: String = intent.getStringExtra("SendStuff")
        txtshow.text = strShow

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })
    }
}
