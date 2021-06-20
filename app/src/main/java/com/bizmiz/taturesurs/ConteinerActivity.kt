package com.bizmiz.taturesurs

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bizmiz.taturesurs.Fragments.*

class ConteinerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteiner)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        when(intent.extras?.get("id")){
            R.id.dushanba->{makeCurrentFragment(DushanbaFragment())}
            R.id.seshanba->{makeCurrentFragment(SeshanbaFragment())}
            R.id.chorshanba->{makeCurrentFragment(ChorshanbaFragment())}
            R.id.payshanba->{makeCurrentFragment(PayshanbaFragment())}
            R.id.juma->{makeCurrentFragment(JumaFragment())}
            R.id.statistika->{}
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.conteiner,fragment).commit()
        }
}