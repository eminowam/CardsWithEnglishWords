package com.example.cardswithenglishwords.presentation.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardswithenglishwords.databinding.FragmentHomeScreenBinding
import com.example.cardswithenglishwords.presentation.adapter.WordsAdapter
import com.example.cardswithenglishwords.presentation.viewmodel.HomeScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeScreenFragment : Fragment() {

    private var currentWordIndex = 0
    private var translationCount = 5

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
        binding.nextBtn.setOnClickListener{
            if (translationCount<=0) {
                showSubscriptionDialog()
            }else{
//                updateWord()
            }
        }
        binding.translationBtn.setOnClickListener {

        }
//        observeWords()
    }
//    private fun observeWords() = with(viewModel) {
//        wordById.observe(viewLifecycleOwner) {
//            getWordById()
//        }
//    }

    private fun showSubscriptionDialog() {
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setTitle("Покупка подписки")
        dialogBuilder.setMessage("Оплатить подписку за 9.99$ в месяц?")
        dialogBuilder.setPositiveButton("Купить") { dialog: DialogInterface, _: Int ->
            purchaseSubscription()
            dialog.dismiss()
        }
        dialogBuilder.setNegativeButton("Нет, спасибо") { dialog: DialogInterface, _: Int ->
            dialog.dismiss()
        }
        dialogBuilder.create().show()
    }

    private fun purchaseSubscription() {
        Log.d("MainActivity", "Подписка куплена!")
        translationCount = -1
    }
}