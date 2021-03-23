package com.example.demo_mvp.view

import com.example.demo_mvp.model.SignInResponse

interface SignInView {
    fun showProgress()
    fun hideProgress()
    fun success(data: SignInResponse)
    fun error(e: Throwable)
}