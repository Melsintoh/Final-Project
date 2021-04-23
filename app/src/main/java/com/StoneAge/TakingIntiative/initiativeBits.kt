package com.StoneAge.TakingIntiative

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

import com.StoneAge.TakingIntiative.CharacterInput

abstract class initiativeBits (context: Context) : SQLiteOpenHelper(context, CharacterInput.NPC_NAME, null, CharacterInput.typeVersion)
{
    //create a table for the inputs to be stored in

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "create Table" + CharacterInput.holding.grid + "(" +
                CharacterInput.holding.placement + "Primary" +
                CharacterInput.holding.colum_grid + "Text is Null"

        db?.execSQL(createTable)


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int)
    {
    db?.execSQL("Drop table" + CharacterInput.holding.grid)
        onCreate(db)

    }

}