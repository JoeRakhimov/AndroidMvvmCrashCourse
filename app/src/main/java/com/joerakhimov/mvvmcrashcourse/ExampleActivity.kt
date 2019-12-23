package com.joerakhimov.mvvmcrashcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val viewModel: ExampleViewModel = ViewModelProviders.of(this)[ExampleViewModel::class.java]

        buttonIncrement.setOnClickListener {
            viewModel.onIncrementButtonClick()
        }

        viewModel.clicksAmount.observe(this, Observer {
            textResult.text = it.toString()
        })

    }

}
