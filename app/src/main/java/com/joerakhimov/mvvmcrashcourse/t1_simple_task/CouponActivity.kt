package com.joerakhimov.mvvmcrashcourse.t1_simple_task

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.joerakhimov.mvvmcrashcourse.R
import kotlinx.android.synthetic.main.activity_coupon.*

class CouponActivity : AppCompatActivity() {

    var viewModel: CouponViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coupon)

        viewModel = ViewModelProviders.of(this)[CouponViewModel::class.java]

        viewModel?.init()

        initCouponCodeInput()

        initApplyCouponButton()

        observeIsCouponCodeValid()

    }

    private fun initCouponCodeInput() {
        inputCouponCode.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val couponCode = s.toString()
                viewModel?.onCouponCodeChanged(couponCode)
            }
        })
    }

    private fun initApplyCouponButton() {
        buttonApplyCoupon.setOnClickListener {
            Toast.makeText(this, getString(R.string.coupon_applied), Toast.LENGTH_LONG).show()
        }
    }

    private fun observeIsCouponCodeValid() {
        viewModel?.isCouponCodeValid?.observe(this, Observer {
            buttonApplyCoupon.isEnabled = it
        })
    }



}
