package com.linocondor.twitchstreamapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rock_paper_scissor_game.*

class RockPaperScissorGameActivity : AppCompatActivity() {

    var playerChoice: String? = null
    var computerOptions = arrayOf("Paper","Rock","Scissors")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rock_paper_scissor_game)

        image_view_paper.setOnClickListener{

            playerChoice = "Paper"
            var playernumber: Int = 2
            rockPaperScissorGame(playerChoice = playerChoice.toString(), playerNumber = playernumber)

        }

        image_view_rock.setOnClickListener{

            playerChoice = "Rock"
            var playernumber: Int = 1

            rockPaperScissorGame(playerChoice = playerChoice.toString(), playerNumber = playernumber)

        }

        image_view_scissors.setOnClickListener{

            var playernumber: Int = 0


            playerChoice = "Scissors"
            rockPaperScissorGame(playerChoice = playerChoice.toString(), playerNumber = playernumber)

        }
    }

    private fun rockPaperScissorGame(playerChoice: String, playerNumber: Int) {

        //choice random option of array
        //var choiceComputer = computerOptions.random()
        //Toast.makeText(this, "Computer choose: $choiceComputer", Toast.LENGTH_LONG).show()

        //array numbers
        var numbersComputer = arrayOf(0,1,2).random()

        var arr = arrayOf(arrayOf("User uses Scissors, Computer uses Scissors, It's a draw!!","User uses Rock, Computer uses Scissors, You win!!","User uses Paper, Computer uses Scissors, You loose!!"), arrayOf("User uses Scissors, Computer uses Rock, You loose!!", "User uses Rock, Computer uses Rock, It's a draw!!", "User uses Paper, Computer uses Rock, You win!!"), arrayOf("User uses Scissors, Computer uses Paper, You win!!", "User uses Rock, Computer uses Paper, You loose!!", "User uses Paper, Computer uses Paper, It's a draw!!"))
        Toast.makeText(this, numbersComputer.toString(), Toast.LENGTH_LONG).show()

        Toast.makeText(this, arr[numbersComputer][playerNumber].toString(), Toast.LENGTH_LONG).show()

//
//        if (playerChoice == "Paper" && choiceComputer == "Rock"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. You win!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Paper" && choiceComputer == "Scissors"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. You loose!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Paper" && choiceComputer == "Paper"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. It's a draw!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Rock" && choiceComputer == "Scissors"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. You win!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Rock" && choiceComputer == "Paper"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. , You loose!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Rock" && choiceComputer == "Rock"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. It's a draw!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Scissors" && choiceComputer == "Paper"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. You win!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Scissors" && choiceComputer == "Rock"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. You loose!!", Toast.LENGTH_LONG).show()
//
//        } else if (playerChoice == "Scissors" && choiceComputer == "Scissors"){
//            Toast.makeText(this, "You choose $playerChoice, computer choose $choiceComputer. It's a draw!!", Toast.LENGTH_LONG).show()
//
//        }

    }


}


