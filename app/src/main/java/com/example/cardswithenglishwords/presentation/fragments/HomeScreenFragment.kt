package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentHomeScreenBinding
import com.example.cardswithenglishwords.presentation.viewmodel.HomeScreenViewModel

class HomeScreenFragment : Fragment() {

    private val binding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }
    private lateinit var viewModel: HomeScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View=binding.root

}