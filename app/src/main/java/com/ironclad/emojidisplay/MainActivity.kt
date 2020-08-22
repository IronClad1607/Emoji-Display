package com.ironclad.emojidisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smileEmojiUnicode = 0x1F601
        val smileEmojiString = getEmoji(smileEmojiUnicode)
        Log.d("PUI", smileEmojiString)
        tvSmile.text = smileEmojiString

        val laughEmojiUnicode = 0x1F602
        val laughEmojiString = getEmoji(laughEmojiUnicode)
        Log.d("PUI", laughEmojiString)
        tvLaugh.text = laughEmojiString

        val winkEmojiUnicode = 0x1F609
        val winkEmojiString = getEmoji(winkEmojiUnicode)
        Log.d("PUI", winkEmojiString)
        tvWink.text = winkEmojiString
    }

    private fun getEmoji(unicode: Int): String {
        return String(Character.toChars(unicode))
    }
}