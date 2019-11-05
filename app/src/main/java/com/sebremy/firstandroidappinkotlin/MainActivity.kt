package com.sebremy.firstandroidappinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {

        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of text view
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value on the text view
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of text view
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)

        // Add count to the extra for the Intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }

}
