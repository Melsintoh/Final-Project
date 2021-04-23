package com.StoneAge.TakingIntiative

import android.os.Bundle
import android.app.Activity
import android.content.Context
import android.provider.BaseColumns
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/*
Game plan: so this is where there the character inputs are handled such as the
NPC/PC name and initiative number. So I read few good article and looked of the in class code
to figure out how to get this working.

 */

class CharacterInput : MainActivity()
{
    companion object
    {
        val NPC_NAME = "com.StoneAge.TakingIntiative.initiativeBits"
        val typeVersion = 1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_input)

        // set up inputs for the character name and the button for completing the transaction
        findViewById<Button>(R.id.complete).setOnClickListener()
        {
            addCharacterName(it)

        }
        findViewById<TextView>(R.id.CharacterName).setOnClickListener()
        {
            updateCharacterName(it)
        }
        findViewById<Button>(R.id.complete).setOnClickListener()
        {
            addCharacterName(it)

        }
        findViewById<TextView>(R.id.TextNumber).setOnClickListener()
        {
           updateCharacterName(it)

        }

    }



    private fun addCharacterName(view: View)
    {

        //
        val editText = findViewById<EditText>(R.id.CharacterName)
        val CharacterName = findViewById<TextView>(R.id.CharacterName)
        val TextNumber = findViewById<TextView>(R.id.TextNumber)

        // makes the text input for the character name and initiavive visble
        editText.visibility = View.GONE
        CharacterName.text = editText.text
        view.visibility = View.GONE
        CharacterName.visibility = View.VISIBLE

        TextNumber.text = editText.text
        TextNumber.visibility = View.VISIBLE
        




    }
    private fun updateCharacterName(View: View)
    {
        val editText = findViewById<EditText>(R.id.CharacterName)
        val complete = findViewById<Button>(R.id.complete)
        

        editText.visibility = View.visibility
        complete.visibility = View.visibility

        editText.visibility = View.visibility
        complete.visibility = View.visibility


        editText.requestFocus()


    }
    class holding : BaseColumns
    {
        companion object
        {
            val grid = "grid"
            val colum_grid = "title"
            val placement = BaseColumns._ID


        }


    }

}

