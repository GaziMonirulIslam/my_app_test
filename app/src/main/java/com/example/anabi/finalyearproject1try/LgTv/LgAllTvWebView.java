package com.example.anabi.finalyearproject1try.LgTv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.example.anabi.finalyearproject1try.R;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandAppleWebview;

public class LgAllTvWebView extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBar;
    WebSettings webSettings;
    String URL = "https://www.walmart.com/browse/electronics/lg-tvs/4k-ultra-hd-tvs/3944_1060825_1939756_9419691?cat_id=3944_1060825_1939756_9419691#searchProductResult";
    SmartphoneBrandAppleWebview fromApple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg_all_tv_web_view);

        progressBar = (ProgressBar) findViewById(R.id.lgAllTvProgressBarId);
        progressBar.setMax(100);
        webView = (WebView) findViewById(R.id.lg_tv_all_webviewId);
        fromApple = new SmartphoneBrandAppleWebview();


        fromApple.PerformanceZoom(webView, progressBar,URL);
        fromApple.BackFunction(webView);


    }
}
