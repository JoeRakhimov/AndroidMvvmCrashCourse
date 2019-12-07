package com.joerakhimov.mvvmcrashcourse.t1_simple_task

class CouponModel {

    fun isCouponCodeValid(couponCode: String): Boolean {
        return couponCode.length >= 6
    }

}