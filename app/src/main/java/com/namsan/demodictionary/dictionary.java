package com.namsan.demodictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dictionary extends AppCompatActivity {


    private String input;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        webView = (WebView) findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient() );
        webView.loadUrl("https://dictionary.cambridge.org");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        getSupportActionBar().hide();
    }
}