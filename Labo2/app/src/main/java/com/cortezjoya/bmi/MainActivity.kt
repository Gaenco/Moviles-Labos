package com.cortezjoya.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

    }

    private lateinit var hint_weightEditText:EditText
    private lateinit var hint_heightEditText:EditText
    private lateinit var calculatebmiButton: Button
    private lateinit var bmivalueTextView: TextView
    private lateinit var bmiclassTextView: TextView



    private fun bind(){
        hint_weightEditText = findViewById(R.id.hint_weight_edit_text)
        hint_heightEditText = findViewById(R.id.hint_height_edit_text)
        calculatebmiButton = findViewById(R.id.calculate_BMI_button)
        bmivalueTextView = findViewById(R.id.BMI_value_text_view)
        bmiclassTextView = findViewById(R.id.bmi_class_text_view)
    }

    private fun calculateBMI(weight: Int ,  height: Int ) : Float = weight.toFloat()/height.toFloat().pow(2)

    private fun showBMI(BMI : Double){

    }

}