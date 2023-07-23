package com.beyzakececi.thefamousbookofflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beyzakececi.thefamousbookofflavors.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedFlavor = intent.getSerializableExtra("famousFlavor") as FamousFlavors

        binding.nameText.text = selectedFlavor.mealname
        binding.captionText.text = selectedFlavor.description
        binding.imageView.setImageResource(selectedFlavor.image)

    }
}