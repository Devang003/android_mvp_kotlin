package com.example.demo_mvp.utils

import android.content.Context
import com.example.demo_mvp.R


/**
 *
 * 0  Use in Throwable exception
 *
 * 100 Continue
 * 101 Switching Protocols
 * 103 Early Hints
 *
 * 200 OK
 * 201 Created
 * 202 Accepted
 * 203 Non-Authoritative Information
 * 204 No Content
 * 205 Reset Content
 * 206 Partial Content
 *
 * 300 Multiple Choices
 * 301 Moved Permanently
 * 302 Found
 * 303 See Other
 * 304 Not Modified
 * 307 Temporary Redirect
 * 308 Permanent Redirect
 *
 * 400 Bad Request
 * 401 Unauthorized / Authorization Required.
 * 402 Payment Required
 * 403 Forbidden
 * 404 Not Found
 * 405 Method Not Allowed
 * 406 Not Acceptable
 * 407 Proxy Authentication Required
 * 408 Request Timeout
 * 409 Conflict
 * 410 Gone
 * 411 Length Required
 * 412 Precondition Failed
 * 413 Payload Too Large
 * 414 URI Too Long
 * 415 Unsupported com.vetron.mall.model.main.Media Type
 * 416 Range Not Satisfiable
 * 417 Expectation Failed
 * 418 I'm a teapot
 * 422 Unprocessable Entity
 * 425 Too Early
 * 426 Upgrade Required
 * 428 Precondition Required
 * 429 Too Many Requests
 * 431 Request Header Fields Too Large
 * 451 Unavailable For Legal Reasons
 *
 * 500 Internal Server Error / Fail to connect server.
 * 501 Not Implemented
 * 502 Bad Gateway
 * 503 Service Unavailable
 * 504 Gateway Timeout
 * 505 HTTP Version Not Supported
 * 506 Variant Also Negotiates
 * 507 Insufficient Storage
 * 508 Loop Detected
 * 511 Network Authentication Required
 *
 * */

fun Context.CheckResponseCode(responseCode: Int) {

  /*  when (responseCode) {

        0 -> {
            ToastMessage(getString(R.string.something_went_wrong_please_try_again))
            return
        }
        100 -> {
            ToastMessage(getString(R.string.continues))
            return
        }
        101 -> {
            ToastMessage(getString(R.string.switching_protocols))
            return
        }
        103 -> {
            ToastMessage("Early Hints")
            return
        }

        200 -> {
            ToastMessage("OK")
            return
        }
        201 -> {
            ToastMessage("Created")
            return
        }
        202 -> {
            ToastMessage("Accepted")
            return
        }
        203 -> {
            ToastMessage("Non-Authoritative Information")
            return
        }
        204 -> {
            ToastMessage(getString(R.string.data_not_available))
            return
        }
        205 -> {
            ToastMessage("Reset Content")
            return
        }
        206 -> {
            ToastMessage("Partial Content")
            return
        }

        300 -> {
            ToastMessage("Multiple Choices")
            return
        }
        301 -> {
            ToastMessage("Moved Permanently")
            return
        }
        302 -> {
            ToastMessage("Found")
            return
        }
        303 -> {
            ToastMessage("See Other")
            return
        }
        304 -> {
            ToastMessage("Not Modified")
            return
        }
        307 -> {
            ToastMessage("Temporary Redirect")
            return
        }
        308 -> {
            ToastMessage("Permanent Redirect")
            return
        }

        400 -> {
            ToastMessage("Bad Request")
            return
        }
        401 -> {
            ToastMessage("Unauthorized")

            return
        }
        402 -> {
            ToastMessage("Payment Required")
            return
        }
        403 -> {
//            ToastMessage("Forbidden")
            return
        }
        404 -> {
            ToastMessage(getString(R.string.data_not_available))
            return
        }
        405 -> {
            ToastMessage("Method Not Allowed")
            return
        }
        406 -> {
//            ToastMessage("Not Acceptable")
            return
        }
        407 -> {
            ToastMessage("Proxy Authentication Required")
            return
        }
        408 -> {
            ToastMessage(getString(R.string.request_timeout))
            return
        }
        409 -> {
            ToastMessage("Conflict")
            return
        }
        410 -> {
            ToastMessage("Gone")
            return
        }
        411 -> {
            ToastMessage("Length Required")
            return
        }
        412 -> {
            ToastMessage("Precondition Failed")
            return
        }
        413 -> {
            ToastMessage("Payload Too Large")
            return
        }
        414 -> {
            ToastMessage("URI Too Long")
            return
        }
        415 -> {
            ToastMessage("Unsupported com.vetron.mall.model.main.Media Type")
            return
        }
        416 -> {
            ToastMessage("Range Not Satisfiable")
            return
        }
        417 -> {
            ToastMessage("Expectation Failed")
            return
        }
        418 -> {
            ToastMessage("I'm a teapot")
            return
        }
        422 -> {
            ToastMessage("Unprocessable Entity")
            return
        }
        425 -> {
            ToastMessage("Too Early")
            return
        }
        426 -> {
            ToastMessage("Upgrade Required")
            return
        }
        428 -> {
            ToastMessage("Precondition Required")
            return
        }
        429 -> {
            ToastMessage("Too Many Requests")
            return
        }
        431 -> {
            ToastMessage("Request Header Fields Too Large")
            return
        }
        451 -> {
            ToastMessage("Unavailable For Legal Reasons")
            return
        }

        500 -> {
            ToastMessage(getString(R.string.fail_to_connect_server))
            return
        }
        501 -> {
            ToastMessage("Not Implemented")
            return
        }
        502 -> {
            ToastMessage("Bad Gateway")
            return
        }
        503 -> {
            ToastMessage(getString(R.string.service_unavailable))
            return
        }
        504 -> {
            ToastMessage("Gateway Timeout")
            return
        }
        505 -> {
            ToastMessage("HTTP Version Not Supported")
            return
        }
        506 -> {
            ToastMessage("Variant Also Negotiates")
            return
        }
        507 -> {
            ToastMessage("Insufficient Storage")
            return
        }
        508 -> {
            ToastMessage("Loop Detected")
            return
        }
        511 -> {
            ToastMessage("Network Authentication Required")
            return
        }
    }*/
}
