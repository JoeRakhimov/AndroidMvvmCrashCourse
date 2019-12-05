package com.joerakhimov.mvvmcrashcourse.e3_mvc_example

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.joerakhimov.mvvmcrashcourse.R
import com.joerakhimov.mvvmcrashcourse.e1_mvvm_example.ExampleModel
import kotlinx.android.synthetic.main.activity_example.*

class MvcExampleActivity : AppCompatActivity() {

    private val model = ExampleModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        showClicksAmount()

        buttonIncrement.setOnClickListener {
            model.incrementClicksAmount()
            showClicksAmount()
        }

    }

    private fun showClicksAmount() {
        val clicksAmount = model.getClicksAmount()
        textResult.text = clicksAmount.toString()
    }

}
