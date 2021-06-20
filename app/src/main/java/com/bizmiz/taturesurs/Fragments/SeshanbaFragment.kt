package com.bizmiz.taturesurs.Fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.bizmiz.taturesurs.NastroykaActivity
import com.bizmiz.taturesurs.R
import kotlinx.android.synthetic.main.fragment_seshanba.*

class SeshanbaFragment : Fragment() {
    var fanlar: Array<String> = arrayOf()
    private val toast: String =
        "Bunday fan mavjud emas \nSozlamalar bo'limidan dars jadvalini ko'rib chiqing"
    private lateinit var nastroykaActivity: NastroykaActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seshanba, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nastroykaActivity = NastroykaActivity()
        val guruh: SharedPreferences = requireActivity().getSharedPreferences(
            "prefsFIle",
            Context.MODE_PRIVATE
        )
        val guruhId = guruh.getInt("position", 0)
        if (guruhId == 1) {
            fanlar = nastroykaActivity.fanlar_kt
        } else if (guruhId == 4) {
            fanlar = nastroykaActivity.fanlar_di
        } else {
            fanlar = nastroykaActivity.fanlar_tk_ax
        }

        val prefs1: SharedPreferences =
            requireActivity().getSharedPreferences("s_fan1", Context.MODE_PRIVATE)
        val prefs2: SharedPreferences =
            requireActivity().getSharedPreferences("s_fan2", Context.MODE_PRIVATE)
        val prefs3: SharedPreferences =
            requireActivity().getSharedPreferences("s_fan3", Context.MODE_PRIVATE)
        val prefs4: SharedPreferences =
            requireActivity().getSharedPreferences("s_fan4", Context.MODE_PRIVATE)
        val fan1 = prefs1.getInt("s_fan1", 0)
        val fan2 = prefs2.getInt("s_fan2", 0)
        val fan3 = prefs3.getInt("s_fan3", 0)
        val fan4 = prefs4.getInt("s_fan4", 0)
        para_1.text = fanlar[fan1]
        para_2.text = fanlar[fan2]
        para_3.text = fanlar[fan3]
        para_4.text = fanlar[fan4]
        para_1.setOnClickListener {
            if (fan1 == 0) {
                register()
            } else {
                getIntent(fan1.toString())
            }
        }
        para_2.setOnClickListener {
            if (fan2 == 0) {
                register()
            } else {
                getIntent(fan2.toString())
            }
        }
        para_3.setOnClickListener {
            if (fan3 == 0) {
                register()
            } else {
                getIntent(fan3.toString())
            }
        }
        para_4.setOnClickListener {
            if (fan4 == 0) {
                register()
            } else {
                getIntent(fan4.toString())
            }
        }
    }

    private fun getIntent(id: String) {
        val intent = Intent(requireActivity(), ActivitySayt::class.java)
        intent.putExtra("sayt1", "https://inter.tatunf.uz/index.php?fan=$id")
        startActivity(intent)
    }

    private fun register() {
        val message = AlertDialog.Builder(requireActivity());
        message.setMessage(toast)
            .setCancelable(false)
            .setPositiveButton("Dars jadvali") { message, _ ->
                val intent = Intent(requireContext(), NastroykaActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
            .setNegativeButton("yopish") { message, _ ->
                message.dismiss()
            }
            .create().show()
    }

}