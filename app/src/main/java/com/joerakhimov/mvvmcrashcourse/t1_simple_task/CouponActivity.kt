package com.joerakhimov.mvvmcrashcourse.t1_simple_task

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.joerakhimov.mvvmcrashcourse.R
import kotlinx.android.synthetic.main.activity_coupon.*

class CouponActivity : AppCompatActivity() {

    val viewModel = CouponViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coupon)

        viewModel.init()

        initCouponCodeInput()

        observeIsCouponCodeValid()

    }

    private fun initCouponCodeInput() {
        inputCouponCode.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val couponCode = s.toString()

                // TODO 1: pass coupon code to ViewModel

            }
        })
    }

    private fun observeIsCouponCodeValid() {
        viewModel.isCouponCodeValid.observe(this, Observer {

            // TODO 4: enable or disable 'Apply Coupon' button

        })
    }

}
