package com.example.demo_mvp.presenter

import android.content.Context
import com.example.demo_mvp.api_client.API
import com.example.demo_mvp.model.SignInResponse
import com.example.demo_mvp.view.SignInView
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class SignInPresenter(internal var context: Context, internal var view: SignInView) {

    /**
     * API call for postSignIn host
     *
     * @param country_code send country_code as request parameter in API.
     * @param mobile send username as request parameter in API.
     * @param password send password as request parameter in API.
     */
    fun setSignIn(
        email: String,
        password: String
    ) {
        API(context)
            .postSignIn(context, email, password)
            .getObjectObservable(SignInResponse::class.java)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<SignInResponse> {
                override fun onSubscribe(d: Disposable) {
                    view.showProgress()
                }

                override fun onNext(data: SignInResponse) {
                    view.success(data)
                }

                override fun onError(e: Throwable) {
                    view.error(e)
                    view.hideProgress()
                }

                override fun onComplete() {
                    view.hideProgress()

                }
            })
    }

}