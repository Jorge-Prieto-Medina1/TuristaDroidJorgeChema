package com.jorgeprieto.turistadroidjorgechema.ui.misSitios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jorgeprieto.turistadroidjorgechema.R



class MisSitiosFragment : Fragment() {

  private lateinit var misSitiosViewModel: MisSitiosViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    misSitiosViewModel =
            ViewModelProviders.of(this).get(MisSitiosViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_sitios, container, false)

    misSitiosViewModel.text.observe(viewLifecycleOwner, Observer {

    })
    return root
  }
}