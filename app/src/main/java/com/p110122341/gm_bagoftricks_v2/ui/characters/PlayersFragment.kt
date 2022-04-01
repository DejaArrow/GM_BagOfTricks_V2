package com.p110122341.gm_bagoftricks_v2.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.p110122341.gm_bagoftricks_v2.databinding.FragmentDiceBinding
import com.p110122341.gm_bagoftricks_v2.ui.characters.PlayersViewModel

class PlayersFragment : Fragment() {

    private var _binding: FragmentDiceBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val PlayersViewModel =
            ViewModelProvider(this)[PlayersViewModel::class.java]

        _binding = FragmentDiceBinding.inflate(inflater, container, false)
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