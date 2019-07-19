package com.example.anabi.finalyearproject1try;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandAppleWebview;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandAsusWebview;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandHuaweiWebview;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandNokiaWebview;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandSamsungWebview;
import com.example.anabi.finalyearproject1try.SmartphoneBrandActivityWebview.SmartphoneBrandXiomiWebview;

public class Smartphone_brandList_activity extends AppCompatActivity {

    CardView appleCardView,samsungCardView,xiomiCardView,huaweiCardView,nokiaCardView,asusCardView;
    Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone_brand_list_activity);

        appleCardView = (CardView) findViewById(R.id.appleSmartphoneCardViewId);
        samsungCardView = (CardView) findViewById(R.id.samsungSmartphoneCardViewId);
        xiomiCardView = (CardView) findViewById(R.id.xiomiSmartphoneCardViewId);
        huaweiCardView = (CardView) findViewById(R.id.huaweiSmartphoneCardViewId);
        nokiaCardView = (CardView) findViewById(R.id.nokiaSmartphoneCardViewId);
        asusCardView = (CardView) findViewById(R.id.asusSmartphoneCardViewId);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        appleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/iphone/?id=" +myPackage));
                //startActivity(intent);

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandAppleWebview.class);
                startActivity(intent);

            }
        });

        samsungCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandSamsungWebview.class);
                startActivity(intent);

                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/global/galaxy/?id=" +myPackage));
               // startActivity(intent);
            }
        });

        xiomiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandXiomiWebview.class);
                startActivity(intent);

                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mi.com/bd/?id=" +myPackage));
                //startActivity(intent);
            }
        });

        huaweiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandHuaweiWebview.class);
                startActivity(intent);

                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://consumer.huawei.com/en/phones/?id=" +myPackage));
                //startActivity(intent);
            }
        });

        nokiaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandNokiaWebview.class);
                startActivity(intent);

                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nokia.com/phones/en_int/android-phones?id=" +myPackage));
                //startActivity(intent);
            }
        });

        asusCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.vibrate(50);
                Intent intent = new Intent(getApplicationContext(),SmartphoneBrandAsusWebview.class);
                startActivity(intent);

                //final String myPackage = getPackageName();
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asus.com/Phone/?id=" +myPackage));
                //startActivity(intent);
            }
        });


    }
}
