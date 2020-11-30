package com.example.t1u2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ok = (Button)findViewById(R.id.ok);
        EditText url = (EditText)findViewById(R.id.url);
        WebView web =(WebView)findViewById(R.id.web);
        web.setWebViewClient(new visual());
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = url.getText().toString();

                web.getSettings().setLoadsImagesAutomatically(true);
                web.getSettings().setJavaScriptEnabled(true);
                web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                web.loadUrl("https://"+x);

            }
        });
    }
private class visual extends WebViewClient{
    public boolean urlVisual(WebView view, String url){
        view.loadUrl(url);
        return true;
    }
}
}