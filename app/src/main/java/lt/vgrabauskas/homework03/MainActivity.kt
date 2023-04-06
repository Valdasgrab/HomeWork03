package lt.vgrabauskas.homework03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val TAG = "arrays_tag"
    lateinit var arrayListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayListView = findViewById(R.id.textListView)



        fizzBuzz()
    }

    private fun fizzBuzz() {
        var numberArray: IntArray = IntArray(100)
        var wordArray = arrayOfNulls<String>(100)


        for (number in 1..100) {
            numberArray[number - 1] = number
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
    }


}