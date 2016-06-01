package com.kobinotes.hacerllamadawebview;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by coby on 5/31/16.
 */
public class ClienteWebView extends WebViewClient {

    MainActivity main ;

    public ClienteWebView(MainActivity main)
    {
        this.main = main;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        Log.e("Url",url);

        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse(url));
        if(ActivityCompat.checkSelfPermission(main, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
            return true;
        main.startActivity(i);
        return true;
    }
}
