package com.joerakhimov.mvvmcrashcourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CouponViewModel: ViewModel() {

    private val model = CouponModel()

    val isCouponCodeValid = MutableLiveData<Boolean>()

    fun init() {
        isCouponCodeValid.value = false
    }

    fun onCouponCodeChanged(couponCode: String) {
        isCouponCodeValid.value = model.isCouponCodeValid(couponCode)
    }

}