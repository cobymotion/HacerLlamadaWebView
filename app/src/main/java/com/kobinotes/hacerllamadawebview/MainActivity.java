package com.kobinotes.hacerllamadawebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.ventana)
    WebView ventana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ButterKnife.bind(this);

        ventana.setWebViewClient(new ClienteWebView(this));

        ventana.loadUrl("http://ledkax.com/kobinotes/telefonos.html");
    }
}
