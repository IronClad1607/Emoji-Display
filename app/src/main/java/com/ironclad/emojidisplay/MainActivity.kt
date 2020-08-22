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
        val laughEmojiUnicode = 0x1F602
        val winkEmojiUnicode = 0x1F609
        val tongueOutEmojiUnicode = 0x1F60B
        val eyeLoveEmojiUnicode = 0x1F60D
        val tauntEmojiUnicode = 0x1F60F
        val seriousTauntEmojiUnicode = 0x1F612
        val kissEmojiUnicode = 0x1F618
        val angryEmojiUnicode = 0x1F624
        val fineEmojiUnicode = 0x1F62A
        val shockEmojiUnicode = 0x1F631
        val shyEmojiUnicode = 0x1F648
        val earthEmojiUnicode = 0x1F30F
        val pumpkinEmojiUnicode = 0x1F383
        val cryingEmojiUnicode = 0x1F62D
        val oneEyeTearEmojiUnicode = 0x1F625
        val movieEmojiUnicode = 0x1F3AC
        val hundredEmojiUnicode = 0x1F4AF
        val fireEmojiUnicode = 0x1F525
        val sleepingEmojiUnicode = 0x1F634
        val heartEmojiUnicode = 0xFE0F;
    }

    private fun getEmoji(unicode: Int): String {
        return String(Character.toChars(unicode))
    }
}