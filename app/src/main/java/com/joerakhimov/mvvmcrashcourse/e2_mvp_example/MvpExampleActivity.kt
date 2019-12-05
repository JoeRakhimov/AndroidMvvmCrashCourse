package com.joerakhimov.mvvmcrashcourse.e2_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joerakhimov.mvvmcrashcourse.R
import kotlinx.android.synthetic.main.activity_example.*

class MvpExampleActivity : AppCompatActivity(), ExampleView {

    val presenter = ExamplePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        presenter.init()

        buttonIncrement.setOnClickListener {
            presenter.onIncrementButtonClick()
        }

    }

    override fun showClicksAmount(clicksAmount: Int) {
        textResult.text = clicksAmount.toString()
    }

}
