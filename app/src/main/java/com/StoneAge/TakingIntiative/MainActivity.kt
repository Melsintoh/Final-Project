package com.StoneAge.TakingIntiative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.StoneAge.TakingIntiative.CharacterInput



open class MainActivity : AppCompatActivity() {

    private val PC: MutableList<Any> = mutableListOf<Any>()
    private val adapter by lazy { makeAdapter(PC) }
    private var makeAdapter: MutableList<Any>? = null
    private var storage: initiativeBits
    private var initiativeListView : ListView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        // creates layout and updates UI
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        updateUI()


    }

    private fun updateUI()
    {
        val OrderList = mutableListOf<Any>()
        val it = storage.readableDataBase

        //will recieve info and set it up in the mutable list
        if(makeAdapter == null)
        {
            makeAdapter?.clear()
            makeAdapter?.addAll(OrderList)
            makeAdapter?.notifyDataSetChanged()


        }
        else
        {

            makeAdapter = mutableListOf(this, R.layout.character_input, R.id.NPCname, list)

            initiativeListView.adapter = makeAdapter
        }

        it.close()

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }




}

override fun onOptionItemSelected(item: MenuItem): Boolean
{
    // use the options in the layout and gets the info from Character Input
    findViewById< Button>(R.id.add).setOnClickListener()
    {
        when(item.itemId)
        {
            R.id.list->
            {
                val nameEditText = CharacterInput.CharacterName(this)
                val numberEditText = CharacterInput.TextNumber(this)
                val dialog = AlertDialog.Builder(this)

                Log.d(TAG, "Character: " + CharacterInput.CharacterName,
                        TAG, "initiave" + CharacterInput.TextNumber

                )
                updateUI()

            }



        }




    }
}

fun setNegateiveButton(s: String, nothing: Nothing?): Any {

}

private operator fun <E> MutableList<E>?.invoke(pc: E): Any {
    TODO("Not yet implemented")
}
