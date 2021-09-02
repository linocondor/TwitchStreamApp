package com.linocondor.twitchstreamapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var followerName: EditText? = null
    private var textMessage: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //call text entry id
        followerName = findViewById(R.id.edit_text_follower_name)
        textMessage = findViewById(R.id.edit_text_message)

        //Call button id
        val buttonThanksFollower: Button = findViewById(R.id.button_thanks_follower)

        buttonThanksFollower.setOnClickListener {

            var greetingMessageText = "Hi" + followerName?.text.toString() + ", " + textMessage?.text.toString()

            Toast.makeText(this, greetingMessageText, Toast.LENGTH_LONG).show()

            val rockPaperScissorGame = Intent(this, RockPaperScissorGameActivity::class.java)
            startActivity(rockPaperScissorGame)

        }


    }
}