package com.bizmiz.taturesurs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class ActivitySayt extends Activity {
    private WebView sayt;
    private Activity activity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        se.getStringExtra("sayt1");
        sayt = findViewById(R.id.sayt);

        WebSettings web = sayt.getSettings();
        web.setDomStorageEnabled(true);
        web.setBuiltInZoomControls(true);
        web.setUseWideViewPort(true);
        web.setBlockNetworkImage(false);


        saytClass webViewClient = new saytClass(this);
        sayt.setWebViewClient(webViewClient);
        sayt.loadData("<html><body>Hello, Android</body></html>",
                "text/html", "UTF-8");
        sayt.loadUrl(saytId);

        sayt.setDownloadListener(new DownloadListener() {

            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {

                Dr) getSystemService(
                        DOWNLOAD_SERVICE);

                dm.enqueue(request);

                Toast.makeText(ActivitySayt.this, url.replace(
                        "https://inter.tatunf.uz/Elib_baza/Komplex/", ""
                ) + " yuklab olinmoqda...", Toast.LENGTH_SHORT).show();
            }

        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.sayt.canGoBack()) {
            this.sayt.goBack();
    (false)how();
    }
}