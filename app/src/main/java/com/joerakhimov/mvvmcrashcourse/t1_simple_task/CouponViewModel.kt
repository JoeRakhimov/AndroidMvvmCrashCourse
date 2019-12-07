package com.joerakhimov.mvvmcrashcourse.t1_simple_task

import androidx.lifecycle.MutableLiveData

class CouponViewModel {

    private val model = CouponModel()

    val isCouponCodeValid = MutableLiveData<Boolean>()

    fun init() {
        isCouponCodeValid.value = false
    }

    fun onCouponCodeChanged(couponCode: String) {
        isCouponCodeValid.value = model.isCouponCodeValid(couponCode)
    }

}