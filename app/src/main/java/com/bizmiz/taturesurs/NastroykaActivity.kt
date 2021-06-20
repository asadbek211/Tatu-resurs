package com.bizmiz.taturesurs

import android.content.Context
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_nastroyka.*

class NastroykaActivity : AppCompatActivity() {
         val fanlar_kt: Array<String> = arrayOf(
             "DARS YO'Q","WEB DASTURLASH",
             "ALGORITMLARNI LOYIXALASH",
             "KOMPYUTERNI TASHKIL ETISH",
             "TALIMGA KIRISH",
             "EXTIMOLLIK VA STATISTIKA"
    )
    val fanlar_di: Array<String> = arrayOf(
        "DARS YO'Q","WEB DASTURLASH",
        "ALGORITMLARNI LOYIXALASH",
        "DASTURIY INJINERINGA KIRISH",
        "KOMPYUTERNI TASHKIL ETISH",
        "EXTIMOLLIK VA STATISTIKA"
    )
         val fanlar_tk_ax: Array<String> = arrayOf(
        "DARS YO'Q","WEB DASTURLASH",
        "ALGORITMLARNI LOYIXALASH",
        "KOMPYUTERNI TASHKIL ETISH",
        "ELEKTRONIKA VA SXEMALAR",
        "EXTIMOLLIK VA STATISTIKA"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nastroyka)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        val guruh: SharedPreferences = getSharedPreferences("prefsFIle", Context.MODE_PRIVATE)
        val guruhId = guruh.getInt("position",0)
        if (guruhId==1){
            spinner(fanlar_kt)
        }else if (guruhId==4){
            spinner(fanlar_di)
        }
        else{
            spinner(fanlar_tk_ax)
        }
        SpinnerSetSelection()
       d_fan1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
           override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
               val prefs: SharedPreferences = getSharedPreferences("d_fan1", Context.MODE_PRIVATE)
               val editor: SharedPreferences.Editor = prefs.edit()
               editor.putInt("d_fan1", position)
               editor.apply()}
           override fun onNothingSelected(parent: AdapterView<*>?) {}}
        d_fan2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("d_fan2", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("d_fan2", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        d_fan3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("d_fan3", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("d_fan3", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        d_fan4.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("d_fan4", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("d_fan4", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}

        s_fan1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("s_fan1", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("s_fan1", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        s_fan2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("s_fan2", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("s_fan2", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        s_fan3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("s_fan3", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("s_fan3", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        s_fan4.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("s_fan4", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("s_fan4", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}

        ch_fan1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("ch_fan1", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("ch_fan1", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        ch_fan2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("ch_fan2", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("ch_fan2", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        ch_fan3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("ch_fan3", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("ch_fan3", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        ch_fan4.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("ch_fan4", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("ch_fan4", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}

        p_fan1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("p_fan1", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("p_fan1", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        p_fan2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("p_fan2", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("p_fan2", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        p_fan3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("p_fan3", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("p_fan3", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        p_fan4.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("p_fan4", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("p_fan4", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}

        j_fan1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("j_fan1", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("j_fan1", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        j_fan2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("j_fan2", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("j_fan2", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        j_fan3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("j_fan3", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("j_fan3", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}}
        j_fan4.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val prefs: SharedPreferences = getSharedPreferences("j_fan4", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor = prefs.edit()
                editor.putInt("j_fan4", position)
                editor.apply()}
            override fun onNothingSelected(parent: AdapterView<*>?) {}
    }
    }
    private fun spinner(fanlar:Array<String>){
        val adapter = ArrayAdapter(this, R.layout.spinner_item, fanlar)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        d_fan1.adapter = adapter
        d_fan2.adapter = adapter
        d_fan3.adapter = adapter
        d_fan4.adapter = adapter

        s_fan1.adapter = adapter
        s_fan2.adapter = adapter
        s_fan3.adapter = adapter
        s_fan4.adapter = adapter

        ch_fan1.adapter = adapter
        ch_fan2.adapter = adapter
        ch_fan3.adapter = adapter
        ch_fan4.adapter = adapter

        p_fan1.adapter = adapter
        p_fan2.adapter = adapter
        p_fan3.adapter = adapter
        p_fan4.adapter = adapter

        j_fan1.adapter = adapter
        j_fan2.adapter = adapter
        j_fan3.adapter = adapter
        j_fan4.adapter = adapter
    }
    private fun SpinnerSetSelection(){
        val prefs1: SharedPreferences = getSharedPreferences("d_fan1", Context.MODE_PRIVATE)
        val prefs2: SharedPreferences = getSharedPreferences("d_fan2", Context.MODE_PRIVATE)
        val prefs3: SharedPreferences = getSharedPreferences("d_fan3", Context.MODE_PRIVATE)
        val prefs4: SharedPreferences = getSharedPreferences("d_fan4", Context.MODE_PRIVATE)
        d_fan1.setSelection(prefs1.getInt("d_fan1",0))
        d_fan2.setSelection(prefs2.getInt("d_fan2",0))
        d_fan3.setSelection(prefs3.getInt("d_fan3",0))
        d_fan4.setSelection(prefs4.getInt("d_fan4",0))
        val prefs5: SharedPreferences = getSharedPreferences("s_fan1", Context.MODE_PRIVATE)
        val prefs6: SharedPreferences = getSharedPreferences("s_fan2", Context.MODE_PRIVATE)
        val prefs7: SharedPreferences = getSharedPreferences("s_fan3", Context.MODE_PRIVATE)
        val prefs8: SharedPreferences = getSharedPreferences("s_fan4", Context.MODE_PRIVATE)
        s_fan1.setSelection(prefs5.getInt("s_fan1",0))
        s_fan2.setSelection(prefs6.getInt("s_fan2",0))
        s_fan3.setSelection(prefs7.getInt("s_fan3",0))
        s_fan4.setSelection(prefs8.getInt("s_fan4",0))
        val prefs9: SharedPreferences = getSharedPreferences("ch_fan1", Context.MODE_PRIVATE)
        val prefs10: SharedPreferences = getSharedPreferences("ch_fan2", Context.MODE_PRIVATE)
        val prefs11: SharedPreferences = getSharedPreferences("ch_fan3", Context.MODE_PRIVATE)
        val prefs12: SharedPreferences = getSharedPreferences("ch_fan4", Context.MODE_PRIVATE)
        ch_fan1.setSelection(prefs9.getInt("ch_fan1",0))
        ch_fan2.setSelection(prefs10.getInt("ch_fan2",0))
        ch_fan3.setSelection(prefs11.getInt("ch_fan3",0))
        ch_fan4.setSelection(prefs12.getInt("ch_fan4",0))
        val prefs13: SharedPreferences = getSharedPreferences("p_fan1", Context.MODE_PRIVATE)
        val prefs14: SharedPreferences = getSharedPreferences("p_fan2", Context.MODE_PRIVATE)
        val prefs15: SharedPreferences = getSharedPreferences("p_fan3", Context.MODE_PRIVATE)
        val prefs16: SharedPreferences = getSharedPreferences("p_fan4", Context.MODE_PRIVATE)
        p_fan1.setSelection(prefs13.getInt("p_fan1",0))
        p_fan2.setSelection(prefs14.getInt("p_fan2",0))
        p_fan3.setSelection(prefs15.getInt("p_fan3",0))
        p_fan4.setSelection(prefs16.getInt("p_fan4",0))
        val prefs17: SharedPreferences = getSharedPreferences("j_fan1", Context.MODE_PRIVATE)
        val prefs18: SharedPreferences = getSharedPreferences("j_fan2", Context.MODE_PRIVATE)
        val prefs19: SharedPreferences = getSharedPreferences("j_fan3", Context.MODE_PRIVATE)
        val prefs20: SharedPreferences = getSharedPreferences("j_fan4", Context.MODE_PRIVATE)
        j_fan1.setSelection(prefs17.getInt("j_fan1",0))
        j_fan2.setSelection(prefs18.getInt("j_fan2",0))
        j_fan3.setSelection(prefs19.getInt("j_fan3",0))
        j_fan4.setSelection(prefs20.getInt("j_fan4",0))
    }

}