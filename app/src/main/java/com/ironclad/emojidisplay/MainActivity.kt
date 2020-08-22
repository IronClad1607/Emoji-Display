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
        tvLaugh.text = laughEmojiString
    }

    private fun getEmoji(unicode: Int): String {
        return String(Character.toChars(unicode))
    }
}