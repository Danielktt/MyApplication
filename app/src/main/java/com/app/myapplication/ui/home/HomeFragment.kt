package com.app.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.myapplication.LugarTuristicoProvider
import com.app.myapplication.LugaresTuristico
import com.app.myapplication.R
import com.app.myapplication.adapter.LugarTuristicoAdapter
import com.app.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)


    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root
    initRecycleView()

    return root
  }

  private fun initRecycleView() {
    binding.recycleLugares.layoutManager = GridLayoutManager(requireContext(), 2)
    binding.recycleLugares.adapter = LugarTuristicoAdapter(LugarTuristicoProvider.lugaresTuristicoList)
  }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}