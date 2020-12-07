package com.jorgeprieto.turistadroidjorgechema

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        lblRegistro.setPaintFlags(textView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)

        btnGuardar.setOnClickListener {
            if (txtNombreDeUsu.text.trim().isNotEmpty() || txtContrasena.text.trim().isNotEmpty()) {
                Toast.makeText(this, "Comprobando", Toast.LENGTH_LONG).show()
                startActivity(Intent ( this@LoginActivity, MisSitiosActivity::class.java))
                finish();
            } else {

                Toast.makeText(this, "No se admiten campos vacios", Toast.LENGTH_LONG).show()
            }


        }
        lblRegistro.setOnClickListener {
            val actividadRegistrar = Intent(this, RegisterActivity::class.java);
            startActivity(actividadRegistrar)

        }
    }
}
