package com.dodemy.viewbindingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dodemy.viewbindingexample.R
import com.dodemy.viewbindingexample.databinding.FragmentDemoBinding


class DemoInflateFragment : Fragment() {

    private var fragmentDemoBinding: FragmentDemoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDemoBinding.inflate(inflater, container, false)
        fragmentDemoBinding = binding

        // TextView
        "View Binding TextView Example".also { binding.fragmentTextview.text = it }


        // ImageView
        binding.fragmentImageview.setImageResource(R.drawable.ic_launcher_foreground)


        // Button
        "View Binding Button Example".also { binding.fragmentButton.text = it }
        binding.fragmentButton.setOnClickListener {
            Toast.makeText(this.context, "Testing View Binding", Toast.LENGTH_LONG).show()
        }


        return binding.root
    }


    override fun onDestroyView() {
        fragmentDemoBinding = null
        super.onDestroyView()
    }
}