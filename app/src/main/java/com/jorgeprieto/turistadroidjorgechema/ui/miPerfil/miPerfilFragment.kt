package com.jorgeprieto.turistadroidjorgechema.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jorgeprieto.turistadroidjorgechema.R

class MiPerfilFragment : Fragment() {

  private lateinit var miPerfilViewModel: MiPerfilViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    miPerfilViewModel =
    ViewModelProviders.of(this).get(miPerfilViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_miperfil, container, false)

    miPerfilViewModel.text.observe(viewLifecycleOwner, Observer {

    })
    return root
  }
}