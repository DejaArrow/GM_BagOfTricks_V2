package com.p110122341.gm_bagoftricks_v2.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NPCsViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the NPC Screen"
    }
    val text: LiveData<String> = _text
}
