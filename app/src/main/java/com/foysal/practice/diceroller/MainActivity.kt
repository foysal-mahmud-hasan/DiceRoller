package com.foysal.practice.diceroller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.foysal.practice.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.text = "Lets Roll!"
        binding.rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val randText = Random().nextInt(6) + 1
        /*if(randText.toString() == "0")
            binding.diceImage.setImageResource(R.drawable.empty_dice)
        else if(randText.toString() == "1")
            binding.diceImage.setImageResource(R.drawable.dice_1)
        else if(randText.toString() == "2")
            binding.diceImage.setImageResource(R.drawable.dice_2)
        else if(randText.toString() == "3")
            binding.diceImage.setImageResource(R.drawable.dice_3)
        else if(randText.toString() == "4")
            binding.diceImage.setImageResource(R.drawable.dice_4)
        else if(randText.toString() == "5")
            binding.diceImage.setImageResource(R.drawable.dice_5)
        else if(randText.toString() == "6")
            binding.diceImage.setImageResource(R.drawable.dice_6)*/

        val drawableResource = when (randText) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(drawableResource)

    }
}