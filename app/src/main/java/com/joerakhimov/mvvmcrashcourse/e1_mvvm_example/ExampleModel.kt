package com.joerakhimov.mvvmcrashcourse.e1_mvvm_example

class ExampleModel {

    private var clicksAmount = 0

    fun incrementClicksAmount() {
        clicksAmount++
    }

    fun getClicksAmount() = clicksAmount

}