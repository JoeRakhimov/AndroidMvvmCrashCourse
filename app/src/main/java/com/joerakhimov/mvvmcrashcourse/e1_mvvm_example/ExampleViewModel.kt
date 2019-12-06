package com.joerakhimov.mvvmcrashcourse.e1_mvvm_example

import androidx.lifecycle.MutableLiveData
import com.joerakhimov.mvvmcrashcourse.ExampleModel

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