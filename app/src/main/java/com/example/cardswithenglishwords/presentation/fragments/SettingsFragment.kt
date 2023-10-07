package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentSettingsBinding
import com.example.cardswithenglishwords.presentation.viewmodel.SettingsViewModel

class SettingsFragment : Fragment() {

    private val binding by lazy {
        FragmentSettingsBinding.inflate(layoutInflater)
    }

    private lateinit var viewModel: SettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

}