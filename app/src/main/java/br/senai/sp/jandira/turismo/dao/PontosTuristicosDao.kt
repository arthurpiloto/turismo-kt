package br.senai.sp.jandira.turismo.dao

import android.content.Context
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.model.PontoTuristico

class PontosTuristicosDao() {
    // Tudo que está dentro do método companion é estático
    companion object {
        fun getPontosTuristicos(context: Context): List<PontoTuristico> {
            val pt1 = PontoTuristico()
            pt1.codigo = 1
            pt1.nomePontoTuristico = "Fortaleza - CE"
            pt1.descricao = "Fortaleza é a capital do estado do Ceará, no nordeste brasileiro. É conhecida por suas praias, pontuadas por falésias vermelhas, palmeiras, dunas e lagoas."
            pt1.imagem = context.getDrawable(R.drawable.fortaleza)

            val pt2 = PontoTuristico()
            pt2.codigo = 2
            pt2.nomePontoTuristico = "Gramado - RS"
            pt2.descricao = "Gramado é uma cidade turística de montanha no estado mais meridional do Brasil, Rio Grande do Sul. Influenciada pelos colonizadores alemães do século 19, a cidade tem um ar bávaro com chalés alpinos, chocolatiers e lojas de artesanato."
            pt2.imagem = context.getDrawable(R.drawable.gramado)

            val pt3 = PontoTuristico()
            pt3.codigo = 3
            pt3.nomePontoTuristico = "Manhattan - NY"
            pt3.descricao = "Manhattan é o mais densamente povoado dos 5 distritos de Nova York. É composta principalmente pela Ilha de Manhattan, delimitada pelos rios Hudson, East e Harlem."
            pt3.imagem = context.getDrawable(R.drawable.manhattan)

            val pt4 = PontoTuristico()
            pt4.codigo = 4
            pt4.nomePontoTuristico = "Porto de Galinhas - PE"
            pt4.descricao = "Porto de Galinhas é uma praia no município de Ipojuca, Pernambuco, Brasil. Porto de Galinhas é um importante destino turístico."
            pt4.imagem = context.getDrawable(R.drawable.porto_de_galinhas)

            val pt5 = PontoTuristico()
            pt5.codigo = 5
            pt5.nomePontoTuristico = "San Antonio - TX"
            pt5.descricao = "Estendendo-se por vários quilômetros ao longo do rio San Antonio, no coração da cidade, o River Walk é repleto de restaurantes e encantadores pátios ao ar livre, onde você pode sentar e jantar ao lado do rio."
            pt5.imagem = context.getDrawable(R.drawable.texas)

            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4, pt5)

            return pontosTuristicos
        }
    }
}