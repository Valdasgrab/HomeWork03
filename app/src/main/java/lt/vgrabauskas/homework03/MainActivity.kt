package lt.vgrabauskas.homework03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val TAG = "arrays_tag"
    lateinit var arrayListView: ListView
    lateinit var adapter: ArrayAdapter<String>
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayListView = findViewById(R.id.textListView)
        button = findViewById(R.id.clickMeButton)

        button.setOnClickListener {
            fizzBuzz()
        }

    }

    private fun fizzBuzz() {
        val wordArray = arrayOfNulls<String>(100)

        for (number in 1..100) {
            if (number % 3 == 0 && number % 5 == 0) {
                Log.i(TAG, " FIZZBUZZ")
                wordArray.set(number - 1, "FIZZBUZZ")
            } else if (number % 5 == 0) {
                Log.i(TAG, " BUZZ")
                wordArray.set(number - 1, "BUZZ")
            } else if (number % 3 == 0) {
                wordArray.set(number - 1, "FIZZ")
                Log.i(TAG, " fizz")
            } else {
                wordArray.set(number - 1, "$number")
                Log.i(TAG, " $number")
            }
        }

        adapter = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, wordArray
        )
        arrayListView.adapter = adapter

        arrayListView.setOnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position)
            Log.i(TAG, "Clicked on $selectedItem of position $position")
        }
    }


}