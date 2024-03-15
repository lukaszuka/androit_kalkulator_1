package com.example.myapplication
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById(R.id.textView) as TextView

        var button1 = findViewById(R.id.num0) as Button
        // set on-click listener
        button1.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString() + button1.text.toString())
        }
        var button2  = findViewById(R.id.num1) as Button
        // set on-click listener
        button2.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button2.text.toString())
        }
        var button3  = findViewById(R.id.num2) as Button
        // set on-click listener
        button3.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button3.text.toString())
        }
        var button4  = findViewById(R.id.num3) as Button
        // set on-click listener
        button4.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button4.text.toString())
        }
        var button5  = findViewById(R.id.num4) as Button
        // set on-click listener
        button5.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button5.text.toString())
        }
        var button6  = findViewById(R.id.num5) as Button
        // set on-click listener
        button6.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button6.text.toString())
        }
        var button7  = findViewById(R.id.num6) as Button
        // set on-click listener
        button7.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button7.text.toString())
        }
        var button8  = findViewById(R.id.num7) as Button
        // set on-click listener
        button8.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button8.text.toString())
        }
        var button9  = findViewById(R.id.num8) as Button
        // set on-click listener
        button9.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button9.text.toString())
        }
        var button10  = findViewById(R.id.num9) as Button
        // set on-click listener
        button10.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button10.text.toString())
        }
        var button11  = findViewById(R.id.divide) as Button
        // set on-click listener
        button11.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button11.text.toString())
        }
        var button12 = findViewById(R.id.multiply) as Button
        // set on-click listener
        button12.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button12.text.toString())
        }
        var button13 = findViewById(R.id.substract) as Button
        // set on-click listener
        button13.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button13.text.toString())
        }
        var button14 = findViewById(R.id.addition) as Button
        // set on-click listener
        button14.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button14.text.toString())
        }
        var button15 = findViewById(R.id.equal) as Button
        // set on-click listener
        button15.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button15.text.toString())
        }
        var button16 = findViewById(R.id.dot) as Button
        // set on-click listener
        button16.setOnClickListener {
            // your code to perform when the user clicks on the button
            text.setText(text.text.toString()+button16.text.toString())
        }
    }
}