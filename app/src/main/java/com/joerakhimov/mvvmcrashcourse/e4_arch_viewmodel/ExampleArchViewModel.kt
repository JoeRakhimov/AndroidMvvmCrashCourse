package com.joerakhimov.mvvmcrashcourse.e4_arch_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joerakhimov.mvvmcrashcourse.e1_mvvm_example.ExampleModel

class ExampleArchViewModel: ViewModel() {

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