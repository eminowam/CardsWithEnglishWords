package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.data.storage.WordDataBase
import com.example.cardswithenglishwords.databinding.FragmentAddWordBinding
import com.example.cardswithenglishwords.presentation.viewmodel.AddWordViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddWordFragment : Fragment() {
    private val binding by lazy {
        FragmentAddWordBinding.inflate(layoutInflater)
    }
    private val viewModel: AddWordViewModel by viewModel<AddWordViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val db = WordDataBase.getInstance(this.requireContext())
        binding.saveBtn.setOnClickListener {
            val word = WordStorage(
                0,
                binding.wordEd.text.toString(),
                binding.translationEd.text.toString()
            )
            Thread{
                db.wordDao().insert(word)
            }.start()
        }
    }
}