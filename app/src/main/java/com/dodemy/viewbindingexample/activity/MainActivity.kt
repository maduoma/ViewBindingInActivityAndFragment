package com.dodemy.viewbindingexample.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.dodemy.viewbindingexample.databinding.ActivityMainBinding
import com.dodemy.viewbindingexample.fragment.DemoBindFragment
import com.dodemy.viewbindingexample.fragment.DemoInflateFragment
import com.dodemy.viewbindingexample.recyclerview.DemoRecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.fragmentBindButton.setOnClickListener {
            val transaction = this.supportFragmentManager.beginTransaction()
            val frag2 = DemoBindFragment()
            transaction.replace(binding.contentId.id, frag2)
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.commit()
        }

        binding.fragmentInflateButton.setOnClickListener {
            val transaction = this.supportFragmentManager.beginTransaction()
            val frag2 = DemoInflateFragment()
            transaction.replace(binding.contentId.id, frag2)
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.commit()
        }

        binding.recyclerviewButton.setOnClickListener {
            val intent = Intent(this, DemoRecyclerView::class.java)
            startActivity(intent)
        }
    }
}