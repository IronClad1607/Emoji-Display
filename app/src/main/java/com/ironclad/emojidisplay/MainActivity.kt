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

        val tongueOutEmojiUnicode = 0x1F60B
        val tougueOutEmojiString = getEmoji(tongueOutEmojiUnicode)
        Log.d("PUI", tougueOutEmojiString)
        tvTongueOut.text = tougueOutEmojiString

        val eyeLoveEmojiUnicode = 0x1F60D
        val eyeLoveEmojiString = getEmoji(eyeLoveEmojiUnicode)
        Log.d("PUI", eyeLoveEmojiString)
        tvEyeLove.text = eyeLoveEmojiString

        val tauntEmojiUnicode = 0x1F60F
        val tauntEmojiString = getEmoji(tauntEmojiUnicode)
        Log.d("PUI", tauntEmojiString)
        tvTaunt.text = tauntEmojiString

        val seriousTauntEmojiUnicode = 0x1F612
        val seriousTauntEmojiString = getEmoji(seriousTauntEmojiUnicode)
        Log.d("PUI", seriousTauntEmojiString)
        tvSeriousTaunt.text = seriousTauntEmojiString

        val kissEmojiUnicode = 0x1F618
        val kissEmojiString = getEmoji(kissEmojiUnicode)
        Log.d("PUI", kissEmojiString)
        tvKiss.text = kissEmojiString

        val angryEmojiUnicode = 0x1F624
        val angryEmojiString = getEmoji(angryEmojiUnicode)
        Log.d("PUI", angryEmojiString)
        tvAngry.text = angryEmojiString

        val fineEmojiUnicode = 0x1F62A
        val fineEmojiString = getEmoji(fineEmojiUnicode)
        Log.d("PUI", fineEmojiString)
        tvFine.text = fineEmojiString


        val winkEmojiUnicode = 0x1F609
        val winkEmojiString = getEmoji(winkEmojiUnicode)
        Log.d("PUI", winkEmojiString)
        tvWink.text = winkEmojiString


        val winkEmojiUnicode = 0x1F609
        val winkEmojiString = getEmoji(winkEmojiUnicode)
        Log.d("PUI", winkEmojiString)
        tvWink.text = winkEmojiString
    }

    private fun getEmoji(unicode: Int): String {
        return String(Character.toChars(unicode))
    }
}