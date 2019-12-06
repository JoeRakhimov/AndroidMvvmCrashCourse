package com.joerakhimov.mvvmcrashcourse.e2_mvp_example

import com.joerakhimov.mvvmcrashcourse.ExampleModel

class ExamplePresenter(private val view: ExampleView) {

    private val model = ExampleModel()

    fun init() {
        showClicksAmount()
    }

    private fun showClicksAmount() {
        val clicksAmount = model.getClicksAmount()
        view.showClicksAmount(clicksAmount)
    }

    fun onIncrementButtonClick() {
        model.incrementClicksAmount()
        showClicksAmount()
    }

}