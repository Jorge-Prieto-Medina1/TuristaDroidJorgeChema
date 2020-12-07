package com.jorgeprieto.turistadroidjorgechema.ui.cercaDeMi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jorgeprieto.turistadroidjorgechema.R
import com.jorgeprieto.turistadroidjorgechema.ui.slideshow.CercaDeMiViewModel

class CercaDeMiFragment : Fragment() {

  private lateinit var cercaDeMiViewModel: CercaDeMiViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    cercaDeMiViewModel =
    ViewModelProviders.of(this).get(CercaDeMiViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_cercademi, container, false)

    cercaDeMiViewModel.text.observe(viewLifecycleOwner, Observer {

    })
    return root
  }
}