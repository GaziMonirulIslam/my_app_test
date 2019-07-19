package com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.example.anabi.finalyearproject1try.R;

public class SmartphoneBrandHuaweiWebview extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBar;
    WebSettings webSettings;
    String URL = "https://consumer.huawei.com/en/phones/";
    SmartphoneBrandAppleWebview fromApple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone_brand_huawei_webview);

        progressBar = (ProgressBar) findViewById(R.id.huaweiSmartphoneProgressBarId);
        progressBar.setMax(100);
        webView = (WebView) findViewById(R.id.huaweiBrandWebview);
        fromApple = new SmartphoneBrandAppleWebview();


        fromApple.PerformanceZoom(webView, progressBar,URL);
        fromApple.BackFunction(webView);





    }
}
