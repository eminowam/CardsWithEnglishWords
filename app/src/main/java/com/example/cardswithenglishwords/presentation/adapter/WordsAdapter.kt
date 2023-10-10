package com.example.cardswithenglishwords.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardswithenglishwords.R
import com.example.cardswithenglishwords.domain.models.Word

class WordsAdapter() : RecyclerView.Adapter<WordViewHolder>() {

    var words = emptyList<Word>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder =
        WordViewHolder(
            LayoutInflater.from(parent.context).inflate
                (R.layout.list_item, parent, false)
        )
    override fun getItemCount(): Int = words.size

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(words[position])
    }
}

class WordViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val wordTitle = view.findViewById<TextView>(R.id.word_text)
    fun bind(word: Word) {
        wordTitle.text = word.englishWord
    }
}