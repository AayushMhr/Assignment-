package com.aayush.softwaricaapp.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.aayush.softwaricaapp.R


class AboutFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        val intent =
//            Intent(Intent.ACTION_VIEW).setData(Uri.parse("www.softwarica.edu.np"))
//        startActivity(intent)



    }
    var mWebView: WebView? = null
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val myWebView: WebView = view.findViewById(R.id.webview)
//        myWebView.loadUrl("http://www.example.com")

        // val myWebView: WebView = getView().findViewById(R.id.webview)

//
//        val myWebView: WebView = requireView().findViewById(R.id.webview)
//        myWebView.loadUrl("www.google.com")

//        val url = "http://google.com/"
//        val view = view?.findViewById(R.id.webview) as WebView
//        view.settings.javaScriptEnabled = true
//        view.loadUrl(url)


//        mWebView = mWebView!!.findViewById(R.id.mWebView) as WebView
//        mWebView!!.loadUrl("google.com")
//
//        // Enable Javascript
//
//        // Enable Javascript
//        val webSettings: WebSettings = mWebView!!.getSettings()
//        webSettings.javaScriptEnabled = true
//
//        // Force links and redirects to open in the WebView instead of in a browser
//
//        // Force links and redirects to open in the WebView instead of in a browser
//        mWebView!!.setWebViewClient(WebViewClient())



        ////////////////////

        val v: View = inflater.inflate(R.layout.fragment_about, container, false)

        mWebView = v.findViewById<View>(R.id.webview) as WebView
        mWebView!!.loadUrl("https://www.softwarica.edu.np")

        // Enable Javascript

        // Enable Javascript
        val webSettings = mWebView!!.settings
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView!!.webViewClient = WebViewClient()




        return v



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        val myWebView: WebView = requireView().findViewById(R.id.webview)
//        myWebView.loadUrl("www.google.com")



    }


}
