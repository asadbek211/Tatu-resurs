package com.bizmiz.taturesurs

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.Settings
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private val sharedPrefFile = "prefsFIle"
    private val POSITION = "position"
    private val ctivityInfo.SCREEN_ORIENTATION_PORTRAIT
        val reg: SharedPreferences = getSharedPreferences("reg", Context.MODE_PRIVATE)
        val key = reg.getInt("reg",0)
        if (key != 1){
           register()
        }
        getTakePermission()
        val adapter = ArrayAdapter(this, R.layout.spinner_item, gruppalar)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        val pref

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        dushanba.setOnClickListener(this)
        seshanba.setOnClickListener(this)
        chorshanba.setOnClickListener(this)
        payshanba.setOnClickListener(this)
        juma.setOnClickListener(this)
        statistika.setOnClickListener(this)
        savollar.setOnClickListener(this)
        settings.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val prefs: SharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        val key = prefs.getInt(POSITION,0)
        if (key==0){
            Ttent(this, ActivitySayt::class.java)
                intent.putExtra("sayt1", "https://inter.tatunf.uz/index.php?st=21")

                startActivity(intent)
            } else {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("id", view?.id)
                startActivity(intent)
            }
        }


    }
    private fun getTakePermission(){
        if (isPermissionGranted()){

        }else{
            takePermission()
        }
    }
    }
    private fun takePermission() {
        if (Build.VERSION.SDK_INT==Build.VERSION_CODES.R){
           try {
              val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION)
               intent.addCategory("android.intent.category.DEFAULT")
               intent.data = Uri.parse(String.format("package:%s", applicationContext.packageName))
               startActivityForResult(intent, 100)
           }catch (exception: Exception){
               val intent = Intent()
               intent.action = Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION
               startActivityForResult(intent, 100)
           }
        }else{
            ActivityCompat.requestPermissions(
                this,

            if (requestCode==100){
                if (Build.VERSION.SDK_INT==Build.VERSION_CODES.R){
                    if (Environment.isExternalStorageManager()){

                    }else{
                        takePermission()
                    }
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty()){
           if (requestCode == 101){
               val read:Boolean = grantResults[0] ==PackageManager.PERMISSION_GRANTED
               if (read){

               }else{
                   takePermission()
               }
            }
        }
    }
    private fun register() {
        val message = AlertDialog.Builder(this)
        message.setTitle("Kirish")
            .setMessage("Saytga login parol kiriting")
            .setCancelable(false)
            .setPositiveButton("Kirish") { message, _ ->
                val intent = Intent(this, ActivitySayt::class.java)
                intent.putExtra("sayt1", "https://inter.tatunf.uz/index.php")
                startActivity(intent)
            }
            .create().show()
    }
}