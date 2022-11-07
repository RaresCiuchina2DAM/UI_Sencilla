package com.example.uisencilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

private lateinit var txtNombreMostrar: TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    //Recoger el nombre
    val extras = intent.extras
    val nombre = extras?.getString("txtNombre")

    //Mostrar el nombre
    txtNombreMostrar = findViewById(R.id.ApareceText)
    txtNombreMostrar.text = "El nombre que has introducido es: $nombre , y ha aceptado los terminos y condiciones."

    }
}
