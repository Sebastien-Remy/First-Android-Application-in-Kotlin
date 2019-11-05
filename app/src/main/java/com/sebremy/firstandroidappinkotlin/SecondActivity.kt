package com.sebremy.firstandroidappinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {

        // Get the count from the intent extras
        val count =  intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate random number
        val random = Random()
        var randomInt = 0

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number
        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

        // Subsitute the max value into string ressource
        findViewById<TextView>(R.id.textView_label).text = getString(R.string.random_heading, count)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

}
