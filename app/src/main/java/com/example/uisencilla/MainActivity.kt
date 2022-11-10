package com.example.uisencilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import androidx.core.content.ContextCompat.startActivity

    private lateinit var txtNombre: EditText
    private lateinit var BtnAceptar: Button
    private lateinit var AceptarTerminos: Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.editText)
        BtnAceptar = findViewById(R.id.button)
        AceptarTerminos = findViewById(R.id.switch1)


        BtnAceptar.setOnClickListener {
            validar(it)

        }

    }


    fun validar(view: View) {

        do {
            if (txtNombre.text.toString().isEmpty()) {
                txtNombre.error = "Campo obligatorio"
            }
            if (!(AceptarTerminos.isChecked)) {
                AceptarTerminos.error = "Debe aceptar los terminos y condiciones"
            }
            if (AceptarTerminos.isChecked){
                AceptarTerminos.error = null
            }
        }while (txtNombre.text.toString().isEmpty() && !(AceptarTerminos.isChecked))

            val intent = Intent(MainActivity@this, MainActivity2::class.java)

            val b = Bundle()
            b.putString("txtNombre", txtNombre.text.toString())

            //Añadimos la información al intent
            intent.putExtras(b)

            //Iniciamos la nueva actividad
            startActivity(intent)

    }
}