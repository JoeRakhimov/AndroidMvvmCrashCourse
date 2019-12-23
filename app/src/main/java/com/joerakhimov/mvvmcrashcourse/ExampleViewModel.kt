package com.joerakhimov.mvvmcrashcourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joerakhimov.mvvmcrashcourse.ExampleModel

class ExampleViewModel: ViewModel() {

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