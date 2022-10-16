package com.gwsilver.prakticheskaya_rabota_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.CleartextNetworkViolation
import android.util.Log
import android.widget.Button
import androidx.annotation.RestrictTo
import androidx.core.text.set
import com.gwsilver.prakticheskaya_rabota_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var Binding_Class : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Binding_Class = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding_Class.root)

        Binding_Class.ButtonR.setOnClickListener {

            val Start_Indications = if (Binding_Class.EditTextStart.text.toString().toIntOrNull() != null) {
            Binding_Class.EditTextStart.text.toString().toInt()
        }else 0

            val End_Indications = if (Binding_Class.EditTextEnd.text.toString().toIntOrNull() != null) {
                Binding_Class.EditTextEnd.text.toString().toInt()
            }else 0

            val Tarif = if (Binding_Class.EditTextTarif.text.toString().toFloatOrNull() != null) {
                Binding_Class.EditTextTarif.text.toString().toFloat()
            }else 0.0f

            Binding_Class.textViewRashod.text =
                "Расчёт = ${End_Indications - Start_Indications}"
            Binding_Class.textViewSum.text =
                "Сумма = ${(End_Indications - Start_Indications) * Tarif} руб." }

        Binding_Class.ButtonClean.setOnClickListener {

        Binding_Class.EditTextStart.text.clear()
            Binding_Class.EditTextEnd.text.clear()
            Binding_Class.EditTextTarif.text.clear()
            Binding_Class.textViewRashod.text = "Расход"
            Binding_Class.textViewSum.text = "Сумма"
        }
    }
}