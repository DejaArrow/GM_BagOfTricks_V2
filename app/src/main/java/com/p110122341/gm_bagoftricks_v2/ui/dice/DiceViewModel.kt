package com.p110122341.gm_bagoftricks_v2.ui.dice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the dice roller"
    }
    val text: LiveData<String> = _text
}

