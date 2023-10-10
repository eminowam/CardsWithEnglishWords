package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentListBinding
import com.example.cardswithenglishwords.presentation.adapter.WordsAdapter
import com.example.cardswithenglishwords.presentation.viewmodel.HomeScreenViewModel
import com.example.cardswithenglishwords.presentation.viewmodel.ListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListFragment : Fragment() {

    private val binding by lazy {
        FragmentListBinding.inflate(layoutInflater)
    }

    private val viewModel: ListViewModel by viewModel<ListViewModel>()

    private val listWordsAdapter by lazy {
        WordsAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeRv()
        observeWords()
    }

    private fun observeRv() = with(binding) {
        recyclerViewStorage.adapter = listWordsAdapter
    }

    private fun observeWords() = with(viewModel) {
        getAllWords()
        word.observe(viewLifecycleOwner) {
            listWordsAdapter.words = it
        }
    }

}