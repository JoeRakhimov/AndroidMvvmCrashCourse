package com.joerakhimov.mvvmcrashcourse.s1_simple_example

class ExampleModel {

    private var clicksAmount = 0

    fun incrementClicksAmount() {
        clicksAmount++
    }

    fun getClicksAmount() = clicksAmount

}