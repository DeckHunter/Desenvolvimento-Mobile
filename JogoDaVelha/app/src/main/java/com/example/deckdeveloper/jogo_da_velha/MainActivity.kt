package com.example.deckdeveloper.jogo_da_velha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var escolha = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Reset = findViewById<Button>(R.id.Reset)

        val um_um = findViewById<Button>(R.id.um_um)
        val um_dois = findViewById<Button>(R.id.um_dois)
        val um_tres = findViewById<Button>(R.id.um_tres)

        val dois_um = findViewById<Button>(R.id.dois_um)
        val dois_dois = findViewById<Button>(R.id.dois_dois)
        val dois_tres = findViewById<Button>(R.id.dois_tres)

        val tres_um = findViewById<Button>(R.id.tres_um)
        val tres_dois = findViewById<Button>(R.id.tres_dois)
        val tres_tres = findViewById<Button>(R.id.tres_tres)

        val O = findViewById<Button>(R.id.O)
        val X = findViewById<Button>(R.id.X)

        Reset.setOnClickListener {
            um_um.text = null
            um_dois.text = null
            um_tres.text = null
            dois_um.text = null
            dois_dois.text = null
            dois_tres.text = null
            tres_um.text = null
            tres_dois.text = null
            tres_tres.text = null
        }

        O.setOnClickListener {
            escolha = "O"
        }

        X.setOnClickListener {
            escolha = "X"
        }

        um_um.setOnClickListener {
            um_um.text = escolha
        }
        um_dois.setOnClickListener {
            um_dois.text = escolha
        }
        um_tres.setOnClickListener {
            um_tres.text = escolha
        }
        dois_um.setOnClickListener {
            dois_um.text = escolha
        }
        dois_dois.setOnClickListener {
            dois_dois.text = escolha
        }
        dois_tres.setOnClickListener {
            dois_tres.text = escolha
        }
        tres_um.setOnClickListener {
            tres_um.text = escolha
        }
        tres_dois.setOnClickListener {
            tres_dois.text = escolha
        }
        tres_tres.setOnClickListener {
            tres_tres.text = escolha
        }

    }

}
