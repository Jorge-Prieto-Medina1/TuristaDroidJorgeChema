package com.turistadroidjorgechema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnGuardar.setOnClickListener {
            if (txtNombre.text.trim().isNotEmpty() || txtContrasena.text.trim().isNotEmpty()
                || txtEmail.text.trim().isNotEmpty()|| txtNombreDeUsu.text.trim().isNotEmpty()) {
                Toast.makeText(this, "Comprobando", Toast.LENGTH_LONG).show()
                startActivity(Intent ( this@RegisterActivity, NavDrawerActivity::class.java))
                finish();
                
            } else {

                Toast.makeText(this, "No se admiten campos vacios", Toast.LENGTH_LONG).show()
            }


        }

    }
}
