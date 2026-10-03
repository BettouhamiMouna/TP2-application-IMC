package com.example.calculimc

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextPoids: EditText
    private lateinit var editTextTaille: EditText
    private lateinit var buttonCalculer: Button
    private lateinit var buttonEffacer: Button
    private lateinit var textViewImc: TextView
    private lateinit var textViewCategorie: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        editTextPoids = findViewById(R.id.editTextPoids)
        editTextTaille = findViewById(R.id.editTextTaille)
        buttonCalculer = findViewById(R.id.buttonCalculer)
        buttonEffacer = findViewById(R.id.buttonEffacer)
        textViewImc = findViewById(R.id.textViewImc)
        textViewCategorie = findViewById(R.id.textViewCategorie)

        buttonCalculer.setOnClickListener {
            calculerIMC()
        }

        buttonEffacer.setOnClickListener {
            effacer()
        }
    }

    private fun calculerIMC() {

        val poidsText = editTextPoids.text.toString()
        val tailleText = editTextTaille.text.toString()

        if (poidsText.isEmpty() || tailleText.isEmpty()) {
            Toast.makeText(
                this,
                "Veuillez compléter tous les champs",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val poids = poidsText.toDoubleOrNull()
        val taille = tailleText.toDoubleOrNull()

        if (poids == null || taille == null) {
            Toast.makeText(
                this,
                "Veuillez saisir des valeurs valides",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (poids <= 0 || taille <= 0) {
            Toast.makeText(
                this,
                "Le poids et la taille doivent être strictement positifs",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val imc = poids / (taille * taille)

        val imcArrondi = String.format("%.2f", imc)

        var categorie: String
        var couleur: Int

        if (imc < 18.5) {

            categorie = "Insuffisance pondérale"
            couleur = Color.rgb(255, 152, 0)

        } else if (imc < 25) {

            categorie = "Corpulence normale"
            couleur = Color.rgb(76, 175, 80)

        } else if (imc < 30) {

            categorie = "Surpoids"
            couleur = Color.rgb(255, 152, 0)

        } else if (imc < 35) {

            categorie = "Obésité modérée"
            couleur = Color.RED

        } else if (imc < 40) {

            categorie = "Obésité sévère"
            couleur = Color.RED

        } else {

            categorie = "Obésité morbide"
            couleur = Color.rgb(139, 0, 0)
        }

        textViewImc.text = "IMC : $imcArrondi"
        textViewCategorie.text = "Catégorie : $categorie"

        textViewCategorie.setTextColor(couleur)
    }

    private fun effacer() {

        editTextPoids.text.clear()
        editTextTaille.text.clear()

        textViewImc.text = "IMC : "
        textViewCategorie.text = "Catégorie : "

        textViewCategorie.setTextColor(Color.BLACK)

        editTextPoids.requestFocus()
    }
}