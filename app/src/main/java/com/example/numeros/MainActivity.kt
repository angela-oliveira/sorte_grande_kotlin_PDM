package com.example.numeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNumeros: Button = findViewById(R.id.btn_numeros)
        btnNumeros.setOnClickListener { numbers(it) }
        //fun numeros(vier: View) {
        //    val valor = List(6) { Random.nextInt(1, 61)}
        //    val resultado = "${valor[0]}, ${valor[1]}, ${valor[2]}, ${valor[3]}, ${valor[4]}, ${valor[5]}"
        //    Log(resultado)
        //}
    }

    private fun numbers(vier: View) {
        val valor = List(6) { Random.nextInt(1, 61)}
        val result = "${valor[0]}, ${valor[1]}, ${valor[2]}, ${valor[3]}, ${valor[4]}, ${valor[5]}"
        Log.i("RESULTADO", result)
    }
}