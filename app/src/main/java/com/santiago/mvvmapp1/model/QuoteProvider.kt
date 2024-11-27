package com.santiago.mvvmapp1.model

class QuoteProvider {
    companion object{
        fun random():QuoteModel{
            val position = (0..2).random()
            return quotesList[position]
        }
        private val quotesList = listOf<QuoteModel>(
            QuoteModel("Nueva cita", "Autor 1"),
            QuoteModel("Nueva cita dos", "Autor 2"),
            QuoteModel("Nueva cita tres", "Autor 3"),
        )
    }
}