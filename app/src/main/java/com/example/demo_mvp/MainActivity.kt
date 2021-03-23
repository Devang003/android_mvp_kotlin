package com.example.demo_mvp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import com.example.demo_mvp.model.SignInResponse
import com.example.demo_mvp.presenter.SignInPresenter
import com.example.demo_mvp.view.SignInView

class MainActivity : AppCompatActivity(), SignInView {


    var presenter: SignInPresenter? = null
    var context: Context? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this


        //TODO: Initialized SignInPresenter
        presenter = SignInPresenter(context!!, this)
        presenter!!.setSignIn("devang.t@matrixapl.net","123456")

    }

    override fun showProgress() {
      //  ProgressBar.VISIBLE
    }

    override fun hideProgress() {
     //   ProgressBar.GONE
    }

    override fun success(data: SignInResponse) {
        Toast.makeText(this, data.token, Toast.LENGTH_LONG).show()
    }

    override fun error(e: Throwable) {
        Toast.makeText(this,  e.message, Toast.LENGTH_LONG).show()

    }
}