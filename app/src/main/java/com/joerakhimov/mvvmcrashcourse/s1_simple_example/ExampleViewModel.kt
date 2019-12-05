package com.joerakhimov.mvvmcrashcourse.s1_simple_example

import androidx.lifecycle.MutableLiveData

class ExampleViewModel {

    private val model = ExampleModel()

    val clicksAmount = MutableLiveData<Int>()

    init {
        clicksAmount.value = model.getClicksAmount()
    }

    fun onIncrementButtonClick() {
        model.incrementClicksAmount()
        clicksAmount.value = model.getClicksAmount()
    }

}