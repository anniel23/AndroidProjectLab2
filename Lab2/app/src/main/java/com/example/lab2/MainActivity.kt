package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener{
                v -> if (first.text.isEmpty()|| second.text.isEmpty()){
            Snackbar.make(v, "Заполни поле 1 и 2", Snackbar.LENGTH_LONG).show()}
            else {
            var sumString = first.text.toString()
            val num1: Double = sumString.toDouble()
            sumString = second.text.toString()
            val num2: Double = sumString.toDouble()
            val sum = num1 +num2
            result.text = sum.toString()}

        }

        minus.setOnClickListener{
                v -> if (first.text.isEmpty()|| second.text.isEmpty()){
            Snackbar.make(v, "Заполни поле 1 и 2", Snackbar.LENGTH_LONG).show()}
            else {
                var sumString = first.text.toString()
                val num1: Double = sumString.toDouble()
                sumString = second.text.toString()
                val num2: Double = sumString.toDouble()
                val sum = num1 - num2
                result.text = sum.toString()}
            }
        multiply.setOnClickListener{
                v -> if (first.text.isEmpty()|| second.text.isEmpty()){
            Snackbar.make(v, "Заполни поле 1 и 2", Snackbar.LENGTH_LONG).show()}
        else {
            var sumString = first.text.toString()
            val num1: Double = sumString.toDouble()
            sumString = second.text.toString()
            val num2: Double = sumString.toDouble()
            val sum = num1 * num2
            result.text = sum.toString()}
        }
        division.setOnClickListener { v -> if (first.text.isEmpty()|| second.text.isEmpty()){
            Snackbar.make(v, "Заполни поле 1 и 2", Snackbar.LENGTH_LONG).show()}
            else {
                var sumString = first.text.toString()
                val num1: Double = sumString.toDouble()
                sumString = second.text.toString()
                val num2: Double = sumString.toDouble()
                if(num2 == 0.0) {
                    Snackbar.make(v, "Делить на 0 нельзя", Snackbar.LENGTH_LONG).show()
                    result.text = ""
                } else {
                val sum = num1 / num2
                result.text = sum.toString()}
            }
        }

    }


}
