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
        setContentView(R.layout.activity_sayt);
        SharedPreferences reg  = getSharedPreferences("reg", Context.MODE_PRIVATE);
        int key = reg.getInt("reg",0);
        if (key != 1){
            register();}
        String saytId = getIntent().getStringExtra("sayt1");
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

                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.allowScanningByMediaScanner();

                request.setNotificationVisibility(
                        DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                request.setDestinationInExternalPublicDir(
                        Environment.DIRECTORY_DOWNLOADS,    //Download folder
                        url.replace(
                                "https://inter.tatunf.uz/Elib_baza/Komplex/", ""
                        ));                        //Name of file


                DownloadManager dm = (DownloadManager) getSystemService(
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
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    private void register() {
        SharedPreferences prefs  = getSharedPreferences("reg", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor  = prefs.edit();
        AlertDialog.Builder message = new AlertDialog.Builder(this);
        message.setMessage("Saytga Login parol kiriting va Назад knopkasini bosib orqaga qayting va sozlamalar bo'limidan dars jadvalini tuzing")
                .setCancelable(false)
                .setPositiveButton("Ok", (dialog, which) -> {
                    editor.putInt("reg", 1);
                    editor.apply();
                    dialog.dismiss();
                })
                .create().show();
    }
}