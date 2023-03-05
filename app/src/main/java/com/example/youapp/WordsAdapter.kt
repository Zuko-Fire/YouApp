package com.example.youapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.youapp.databinding.ItemWordBinding
import com.example.youapp.model.wordModel

class WordsAdapter(var wordse:List<wordModel>) : Adapter<WordsAdapter.WordsViewHolder>() {

    class WordsViewHolder(
        val binding: ItemWordBinding
    ):RecyclerView.ViewHolder(binding.root)


    var words:List<wordModel> = emptyList()
        set(newValue){
            field = newValue
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemWordBinding.inflate(inflater,parent,false)
        return WordsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        val word:wordModel = wordse[position]
        with(holder.binding){
            wordView.text = word.word
            translateView.text = word.magicWord
            language.text = word.fictionalLanguage
        }
    }

    override fun getItemCount(): Int = words.size
}