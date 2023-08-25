package com.adilegungor.navigationcomponenttask1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.adilegungor.navigationcomponenttask1.databinding.FragmentAnaSayfaBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        return binding.root
    }

    fun gecisYap(view: View) {
        val action = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToDetayFragment()
        Navigation.findNavController(view).navigate(action)
    }
}
