package com.p110122341.gm_bagoftricks_v2.ui.session

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SessionPlanViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is the session planner"
    }
    val text: LiveData<String> = _text
}
