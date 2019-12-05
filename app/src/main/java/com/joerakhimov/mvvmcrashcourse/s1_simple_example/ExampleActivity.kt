package com.joerakhimov.mvvmcrashcourse.s1_simple_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.joerakhimov.mvvmcrashcourse.R
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity : AppCompatActivity() {

    private val viewModel = ExampleViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        buttonIncrement.setOnClickListener {
            viewModel.onIncrementButtonClick()
        }

        viewModel.clicksAmount.observe(this, Observer {
            textResult.text = it.toString()
        })

    }

}
