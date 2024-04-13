package com.example.cadastrocliente

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastrocliente.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.cadastrar.setOnClickListener {

            mostrarInfoEdt()
            mostrarInfoSexoRdb()
            mostrarServicosContratados()
            mostrarEscolhaNovidades()

        }

    }

    fun mostrarInfoEdt() {
        val nome = binding.nome.text.toString()
        Log.d("INFO_CLIENTE", "Nome: ${nome}")

        val email = binding.email.text.toString()
        Log.d("INFO_CLIENTE", "Email: ${email}")

        val idade = binding.idade.text.toString()
        Log.d("INFO_CLIENTE", "Idade: ${idade}")

        val senha = binding.senha.text.toString()
        Log.d("INFO_CLIENTE", "Senha: ${senha}")
    }

    fun mostrarInfoSexoRdb() {

        val radioButtonIdMarcado = binding.sexo.checkedRadioButtonId

        if (radioButtonIdMarcado != -1) {
            val sexoRadio = findViewById<RadioButton>(radioButtonIdMarcado)
            val sexo = sexoRadio.text.toString()
            Log.d("INFO_CLIENTE", "Sexo: ${sexo}")
        }else {
            Log.d("INFO_CLIENTE", "Sexo: não marcado")
        }

    }

    fun mostrarServicosContratados() {

        val servicos = mutableListOf<String>()

        if (binding.musculacao.isChecked) {
            val musculacao = binding.musculacao.text.toString()
            servicos.add(musculacao)
        }

        if (binding.crossfit.isChecked) {
            val crossfit = binding.crossfit.text.toString()
            servicos.add(crossfit)
        }

        if (binding.natacao.isChecked) {
            val natacao = binding.natacao.text.toString()
            servicos.add(natacao)
        }

        Log.d("INFO_CLIENTE", "Serviços: ${servicos}")

    }

    fun mostrarEscolhaNovidades() {
        val escolha = binding.novidades.isChecked
        Log.d("INFO_CLIENTE", "Receber novidades: ${escolha}")
    }

}