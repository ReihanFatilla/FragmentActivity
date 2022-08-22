package com.reift.fragmentactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val args: FragmentActivityArgs by navArgs()

        return when(args.moveArgs){
            1 -> inflater.inflate(R.layout.fragment_first, container, false)
            2 -> inflater.inflate(R.layout.fragment_second, container, false)
            else -> inflater.inflate(R.layout.fragment_first, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_move).setOnClickListener {
            findNavController().navigate(R.id.next)
        }
    }

}