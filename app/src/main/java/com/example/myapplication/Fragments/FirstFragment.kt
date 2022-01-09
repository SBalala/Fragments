package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userInput = view.findViewById<EditText>(R.id.userInput)
        val sendButton = view.findViewById<Button>(R.id.sendButton)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val text = userInput.text.toString()

            if (text.isEmpty()) {
                return@setOnClickListener
            }

            val action = FirstFragmentDirections.actionSendToInbox(text)
            controller.navigate(action)

        }

    }

}