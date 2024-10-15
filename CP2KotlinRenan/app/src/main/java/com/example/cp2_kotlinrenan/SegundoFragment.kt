package com.example.cp2_kotlinrenan

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.text.InputFilter
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SegundoFragment : Fragment() {





    companion object {
        fun newInstance() = SegundoFragment()
    }

    private val viewModel: SegundoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_segundo, container, false)
    }

    val inputFilter = InputFilter { source, start, end, dest, dstart, dend ->
        if (source.toString().matches("[0-9]*".toRegex())) {
            return@InputFilter source
        }
        ""
    }



}