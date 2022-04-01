package com.p110122341.gm_bagoftricks_v2.ui.session

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import android.widget.CheckBox
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.p110122341.gm_bagoftricks_v2.databinding.FragmentSessionPlanBinding



class SessionPlanFragment : Fragment() {
    private var _binding: FragmentSessionPlanBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val planViewModel =
            ViewModelProvider(this)[SessionPlanViewModel::class.java]

        _binding = FragmentSessionPlanBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.cbEventsPlan.setOnClickListener(View.OnClickListener {

            if (binding.cbEventsPlan.isChecked) {
                message(binding.cbEventsPlan.text.toString() + if (binding.cbEventsPlan.isChecked) " Checked " else " UnChecked ")
            }
            else{
                message(binding.cbEventsPlan.text.toString() + if (binding.cbEventsPlan.isChecked) " Checked " else " UnChecked ")
            }


        })

        binding.cbItems.setOnClickListener(View.OnClickListener {

            if (binding.cbItems.isChecked) {
                message(binding.cbItems.text.toString() + if (binding.cbItems.isChecked) " Checked " else " UnChecked ")
            }
            else{
                message(binding.cbItems.text.toString() + if (binding.cbItems.isChecked) " Checked " else " UnChecked ")
            }
        })

        binding.cbLocation.setOnClickListener(View.OnClickListener {

            if (binding.cbLocation.isChecked) {
                message(binding.cbLocation.text.toString() + if (binding.cbLocation.isChecked) " Checked " else " UnChecked ")
            }
            else{
                message(binding.cbLocation.text.toString() + if (binding.cbLocation.isChecked) " Checked " else " UnChecked ")
            }
        })

        binding.cbNpcs.setOnClickListener(View.OnClickListener {

            if (binding.cbNpcs.isChecked) {
                message(binding.cbNpcs.text.toString() + if (binding.cbNpcs.isChecked) " Checked " else " UnChecked ")
            }
            else{
                message(binding.cbNpcs.text.toString() + if (binding.cbNpcs.isChecked) " Checked " else " UnChecked ")
            }
        })

        binding.cbQuest.setOnClickListener(View.OnClickListener {

            if (binding.cbQuest.isChecked) {
                message(binding.cbQuest.text.toString() + if (binding.cbQuest.isChecked) " Checked " else " UnChecked ")
            }
            else{
                message(binding.cbQuest.text.toString() + if (binding.cbQuest.isChecked) " Checked " else " UnChecked ")
            }
        })




        return root;


    }

    fun message(str: String) {
        Toast.makeText( context, str, Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}