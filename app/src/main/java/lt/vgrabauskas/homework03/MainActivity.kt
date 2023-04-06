package lt.vgrabauskas.homework03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var arrayListView: ListView
    lateinit var numberArray: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayListView = findViewById(R.id.textListView)


        fizzBuzz(numberArray)
    }

    private fun fizzBuzz(array: Array<String>) {
        for (number in array) {

        }
    }


}