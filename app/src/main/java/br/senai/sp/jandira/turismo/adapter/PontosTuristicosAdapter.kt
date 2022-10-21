package br.senai.sp.jandira.turismo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.model.PontoTuristico

class PontosTuristicosAdapter(val context: Context) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>() {
    private var pontosTuristicosList = listOf<PontoTuristico>()

    fun updatePontosTuristicosList(pontosTuristicos: List<PontoTuristico>) {
        this.pontosTuristicosList = pontosTuristicos
        notifyDataSetChanged()
    }

    // Cria uma inner class
    class HolderPt(view: View) : RecyclerView.ViewHolder(view) {
        val imageHolderPt = view.findViewById<ImageView>(R.id.image_holder)
        val textTituloPt = view.findViewById<TextView>(R.id.text_view_titulo)
        val textDescricaoPt = view.findViewById<TextView>(R.id.text_view_descricao)
        val buttonDetalhesPt = view.findViewById<Button>(R.id.button_detalhes)

        fun bind(pontoTuristico: PontoTuristico) {
            textTituloPt.text = pontoTuristico.nomePontoTuristico
            textDescricaoPt.text = pontoTuristico.descricao
            imageHolderPt.setImageDrawable(pontoTuristico.imagem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false)
        return HolderPt(view)
    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {
        holder.bind(pontosTuristicosList.get(position))
    }

    override fun getItemCount(): Int {
        return pontosTuristicosList.size
    }
}