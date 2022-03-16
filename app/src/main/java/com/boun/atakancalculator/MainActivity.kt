package com.boun.atakancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun plus(view: View){

        number1= number1Text.text.toString().toDoubleOrNull()
        number2= number2Text.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textView2.text = "Don't forget to enter a number!"
        }
        else{
            result = number1!! + number2!!
            textView2.text = "Result: ${result}"
        }

    }

    fun minus(view: View){

        number1= number1Text.text.toString().toDoubleOrNull()
        number2= number2Text.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textView2.text = "Don't forget to enter a number!"
        }
        else{
            result = number1!! - number2!!
            textView2.text = "Result: ${result}"
        }

    }

    fun cross(view: View){

        number1= number1Text.text.toString().toDoubleOrNull()
        number2= number2Text.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textView2.text = "Don't forget to enter a number!"
        }
        else{
            result = number1!! * number2!!
            textView2.text = "Result: ${result}"
        }
    }

    fun divide(view: View){

        number1= number1Text.text.toString().toDoubleOrNull()
        number2= number2Text.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textView2.text = "Don't forget to enter a number!"
        }

        else if (number2 == 0.0 ){
            textView2.text = "You can't divide a number by 0!!"

        }
        else{
            result = number1!! / number2!!
            textView2.text = "Result: ${result}"
        }


    }


}