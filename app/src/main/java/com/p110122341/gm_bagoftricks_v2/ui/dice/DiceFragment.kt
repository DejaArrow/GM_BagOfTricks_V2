package com.p110122341.gm_bagoftricks_v2.ui.dice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.p110122341.gm_bagoftricks_v2.R
import com.p110122341.gm_bagoftricks_v2.databinding.FragmentDiceBinding



class DiceFragment : Fragment() {
    lateinit var diceImage : ImageView

    private var _binding: FragmentDiceBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val diceViewModel =
            ViewModelProvider(this)[DiceViewModel::class.java]

        _binding = FragmentDiceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rollButton: Button = binding.diceButton
        rollButton.setOnClickListener { rollDiceD20() }
        diceImage = binding.diceImage
        return root;
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun rollDiceD20(){
        val randomInt = (1..20).random()

        val drawableResource = when (randomInt){
            1 -> R.drawable.ic_d20_1
            2 -> R.drawable.ic_d20_2
            3 -> R.drawable.ic_d20_3
            4 -> R.drawable.ic_d20_4
            5 -> R.drawable.ic_d20_5
            6 -> R.drawable.ic_d20_6
            7 -> R.drawable.ic_d20_7
            8 -> R.drawable.ic_d20_8
            9 -> R.drawable.ic_d20_9
            10 -> R.drawable.ic_d20_10
            11 -> R.drawable.ic_d20_11
            12 -> R.drawable.ic_d20_12
            13 -> R.drawable.ic_d20_13
            14 -> R.drawable.ic_d20_14
            15 -> R.drawable.ic_d20_15
            16 -> R.drawable.ic_d20_16
            17 -> R.drawable.ic_d20_17
            18 -> R.drawable.ic_d20_18
            19 -> R.drawable.ic_d20_19
            20 -> R.drawable.ic_d20_20_01
            else -> R.drawable.ic_d20_20_01
        }
        diceImage.setImageResource(drawableResource)
    }
}
