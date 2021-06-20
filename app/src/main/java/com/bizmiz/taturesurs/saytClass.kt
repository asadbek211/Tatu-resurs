package com.bizmiz.taturesurs

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class saytClass(activity: Activity?) : WebViewClient() {
    private var activity: Activity? = null
    override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
        if (url.contains("inter.tatunf.uz")) {
            return false
        }
        // все остальные ссылки будут спрашивать какой браузер открывать
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity!!.startActivity(intent)
        return true
    }

    init {
        this.activity = activity
    }
}