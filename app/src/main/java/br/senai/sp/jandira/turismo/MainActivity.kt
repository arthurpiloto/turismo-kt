package br.senai.sp.jandira.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.adapter.PontosTuristicosAdapter
import br.senai.sp.jandira.turismo.dao.PontosTuristicosDao

class MainActivity : AppCompatActivity() {
    lateinit var rvPontosTuristicos: RecyclerView
    lateinit var adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        // Criar uma instância da RecyclerView
        rvPontosTuristicos = findViewById(R.id.rv_pontos_turisticos)

        // Determinar o layout da RecyclerView
        rvPontosTuristicos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Criar uma instância do Adapter
        adapterPontosTuristicos = PontosTuristicosAdapter(this)
        adapterPontosTuristicos.updatePontosTuristicosList(PontosTuristicosDao.getPontosTuristicos(this))

        // Ligar o Adapter a RecyclerView
        rvPontosTuristicos.adapter = adapterPontosTuristicos
    }
}