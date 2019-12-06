package com.joerakhimov.mvvmcrashcourse

import androidx.lifecycle.MutableLiveData

class ExampleViewModel {

    private val model = ExampleModel()

    val clicksAmount = MutableLiveData<Int>()

    init {
        updateClicksAmount()
    }

    private fun updateClicksAmount() {
        clicksAmount.value = model.getClicksAmount()
    }

    fun onIncrementButtonClick() {
        model.incrementClicksAmount()
        updateClicksAmount()
    }

}