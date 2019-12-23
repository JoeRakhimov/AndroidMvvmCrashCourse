package com.joerakhimov.mvvmcrashcourse.e4_arch_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.joerakhimov.mvvmcrashcourse.R
import com.joerakhimov.mvvmcrashcourse.e1_mvvm_example.ExampleViewModel
import kotlinx.android.synthetic.main.activity_example.*

class ArchCompExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val viewModel: ExampleArchViewModel  = ViewModelProviders.of(this)[ExampleArchViewModel::class.java]

        buttonIncrement.setOnClickListener {
            viewModel.onIncrementButtonClick()
        }

        viewModel.clicksAmount.observe(this, Observer {
            textResult.text = it.toString()
        })

    }

}
