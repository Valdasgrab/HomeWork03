package lt.vgrabauskas.homework03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var arrayListView: ListView
    lateinit var adapter: ArrayAdapter<String>
    lateinit var buttonFizzBuzz: Button
    lateinit var buttonFizzBuzzBonus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayListView = findViewById(R.id.textListView)
        buttonFizzBuzz = findViewById(R.id.clickMeButton)
        buttonFizzBuzzBonus = findViewById(R.id.clickMeButtonBonus)

        buttonFizzBuzz.setOnClickListener {
            fizzBuzz()
        }

        buttonFizzBuzzBonus.setOnClickListener {
            fizzBuzzBonus()
        }

    }

    private fun fizzBuzz() {
        val wordArray = arrayOfNulls<String>(100)

        for (number in 1..100) {
            if (number % 3 == 0 && number % 5 == 0) {
                wordArray[number - 1] = "FIZZBUZZ"
            } else if (number % 5 == 0) {
                wordArray[number - 1] = "BUZZ"
            } else if (number % 3 == 0) {
                wordArray[number - 1] = "FIZZ"
            } else {
                wordArray[number - 1] = "$number"
            }
        }

        adapter = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, wordArray
        )
        arrayListView.adapter = adapter

        arrayListView.setOnItemClickListener { adapterView, view, position, id ->
            adapterView.getItemAtPosition(position)
        }
    }

    private fun fizzBuzzBonus() {

        var generateNumber = Random.nextInt(-50, 50)
        val cycleSpan = Random.nextInt(50, 150)
        var size = 0
        for (number in generateNumber..cycleSpan) {
            size++
        }
        val wordArray = arrayOfNulls<String>(size)
        for (number in 0 until size) {
            if (generateNumber % 3 == 0 && generateNumber % 5 == 0) {
                wordArray[number] = "FIZZBUZZ"
            } else if (generateNumber % 5 == 0) {
                wordArray[number] = "BUZZ"
            } else if (generateNumber % 3 == 0) {
                wordArray[number] = "FIZZ"
            } else {
                wordArray[number] = "$generateNumber"
            }
            generateNumber++
        }

        adapter = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, wordArray
        )
        arrayListView.adapter = adapter

        arrayListView.setOnItemClickListener { adapterView, view, position, id ->
            adapterView.getItemAtPosition(position)
        }
    }
}