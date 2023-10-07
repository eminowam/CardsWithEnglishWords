package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentListBinding
import com.example.cardswithenglishwords.presentation.viewmodel.ListViewModel

class ListFragment : Fragment() {

    private val binding by lazy {
        FragmentListBinding.inflate(layoutInflater)
    }

    private lateinit var viewModel: ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View=binding.root


}