package com.joerakhimov.mvvmcrashcourse

class ExampleModel {

    private var clicksAmount = 0

    fun incrementClicksAmount() {
        clicksAmount++
    }

    fun getClicksAmount() = clicksAmount

}