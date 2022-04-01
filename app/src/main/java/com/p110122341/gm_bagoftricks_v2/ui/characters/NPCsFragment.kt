package com.p110122341.gm_bagoftricks_v2.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.p110122341.gm_bagoftricks_v2.databinding.FragmentNpcsBinding

class NPCsFragment : Fragment() {
    private var _binding: FragmentNpcsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val NPCsViewModel =
            ViewModelProvider(this)[NPCsViewModel::class.java]

        _binding = FragmentNpcsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val rollButton: Button = binding.diceButton
        //rollButton.setOnClickListener { rollDiceD20() }
        //diceImage = binding.diceImage
        return root;
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}