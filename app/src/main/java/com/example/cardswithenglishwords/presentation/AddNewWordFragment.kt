package com.example.cardswithenglishwords.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.R

class AddNewWordFragment : Fragment() {

    companion object {
        fun newInstance() = AddNewWordFragment()
    }

    private lateinit var viewModel: AddNewWordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_new_word, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddNewWordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}