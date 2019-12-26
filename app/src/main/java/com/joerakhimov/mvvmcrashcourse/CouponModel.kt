package com.joerakhimov.mvvmcrashcourse

class CouponModel {

    fun isCouponCodeValid(couponCode: String): Boolean {
        return couponCode.length >= 6
    }

}