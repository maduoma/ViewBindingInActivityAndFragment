package com.dodemy.viewbindinginactivityandfragment.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dodemy.viewbindinginactivityandfragment.R
import com.dodemy.viewbindinginactivityandfragment.databinding.FragmentDemoBinding

class DemoBindFragment : Fragment(R.layout.fragment_demo) {

    private var fragmentDemoBinding: FragmentDemoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDemoBinding.bind(view)
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
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentDemoBinding = null
        super.onDestroyView()
    }

}