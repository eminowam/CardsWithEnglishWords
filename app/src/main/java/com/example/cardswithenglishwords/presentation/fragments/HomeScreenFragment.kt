package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentHomeScreenBinding
import com.example.cardswithenglishwords.presentation.adapter.WordsAdapter
import com.example.cardswithenglishwords.presentation.viewmodel.HomeScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeScreenFragment : Fragment() {


    private val binding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }
    private val viewModel: HomeScreenViewModel by viewModel<HomeScreenViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        observeWords()
    }
//    private fun observeWords() = with(viewModel) {
//        wordById.observe(viewLifecycleOwner) {
//
//        }

}