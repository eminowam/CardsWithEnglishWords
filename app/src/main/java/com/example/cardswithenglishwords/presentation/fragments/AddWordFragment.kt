package com.example.cardswithenglishwords.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.cardswithenglishwords.data.models.WordStorage
import com.example.cardswithenglishwords.data.storage.WordDataBase
import com.example.cardswithenglishwords.databinding.FragmentAddWordBinding
import com.example.cardswithenglishwords.domain.models.Word
import com.example.cardswithenglishwords.presentation.viewmodel.AddWordViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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
            val wordEnglish = binding.wordEd.text.toString().trim()
            val wordTranslate = binding.wordEd.text.toString().trim()

            if (wordEnglish.isNotEmpty() || wordTranslate.isNotEmpty()) {
                val newWord =
                    WordStorage(id = id, englishWord = wordEnglish, translation = wordTranslate)
                lifecycleScope.launch {
                    withContext(Dispatchers.IO) {
                        db.wordDao().insert(word = newWord)
                    }
                    withContext(Dispatchers.Main) {
                        Toast.makeText(
                            requireContext(),
                            "Word added to database",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        binding.wordEd.text.clear()
                        binding.translationEd.text.clear()
                    }
                }
            } else {
                Toast.makeText(requireContext(), "Please enter a word", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
