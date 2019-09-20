package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ThreadLocalRandom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {


    ImageView hangmanPicture;
    TextView scoreText;
    TextView answerTextView;
    String[] states = {"ALABAMA","ALASKA","ARIZONA","ARKANSAS", "CALIFORNIA", "COLORADO", "CONNECTICUT", "DELAWARE", "FLORIDA", "GEORGIA", "HAWAII", "IDAHO", "IOWA", "TENNESSEE", "MONTANA", "OHIO", };
    int wrongGuesses = 0;
    int randomNum = ThreadLocalRandom.current().nextInt(0, 16);
    int score = 10;
    String answerState = states[randomNum];
    int answerLength = answerState.length();
    boolean goodGuess = false;
    int lettersGuessed = 0;
    char[] dashes = new char[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hangmanPicture = findViewById(R.id.imageView);
        scoreText = findViewById(R.id.textView11);
        scoreText.setText(String.valueOf(score));
        answerTextView = findViewById(R.id.textView1);
        setDashes();


    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void setDashes() {
        for (int i = 0; i < (answerLength); i++) {
            dashes[i] = '-';
        }
        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
    }

    public void onClickA(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'A') {
                dashes[i] = 'A';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickB(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'B') {
                dashes[i] = 'B';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickC(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'C') {
                dashes[i] = 'C';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickD(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'D') {
                dashes[i] = 'D';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickE(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'E') {
                dashes[i] = 'E';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickF(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'F') {
                dashes[i] = 'F';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickG(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'G') {
                dashes[i] = 'G';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickH(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'H') {
                dashes[i] = 'H';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickI(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'I') {
                dashes[i] = 'I';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickJ(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'J') {
                dashes[i] = 'J';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickK(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'K') {
                dashes[i] = 'K';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickL(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'L') {
                dashes[i] = 'L';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickM(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'M') {
                dashes[i] = 'M';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickN(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'N') {
                dashes[i] = 'N';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickO(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'O') {
                dashes[i] = 'O';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickP(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'P') {
                dashes[i] = 'P';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickQ(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'Q') {
                dashes[i] = 'Q';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickR(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'R') {
                dashes[i] = 'R';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickS(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'S') {
                dashes[i] = 'S';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickT(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'T') {
                dashes[i] = 'T';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickU(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'U') {
                dashes[i] = 'U';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickV(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'V') {
                dashes[i] = 'V';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickW(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'W') {
                dashes[i] = 'W';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickX(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'X') {
                dashes[i] = 'X';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickY(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'Y') {
                dashes[i] = 'Y';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void onClickZ(View view) {
        view.setEnabled(false);
        goodGuess = false;
        for (int i = 0; i < answerLength; i++) {
            if (answerState.charAt(i) == 'Z') {
                dashes[i] = 'Z';
                goodGuess = true;
                lettersGuessed++;
                score++;
            }
        }
        if (!goodGuess)
            wrongGuesses++;

        String s1 = String.copyValueOf(dashes);
        answerTextView.setText(s1);
        checkWrong();
    }

    public void checkWrong() {
        if (lettersGuessed == answerLength) {
            Intent intent = new Intent(this, Main3Activity.class);
            Bundle extras = new Bundle();
            extras.putInt("score", score);
            extras.putInt("alive", 1);
            intent.putExtras(extras);
            startActivity(intent);
        }

        switch (wrongGuesses) {
            case 0:
                hangmanPicture.setImageResource(R.drawable.hangstart);
                scoreText.setText(String.valueOf(score));
                break;
            case 1:
                hangmanPicture.setImageResource(R.drawable.hang_one);

                scoreText.setText(String.valueOf(score - 3));
                break;
            case 2:
                hangmanPicture.setImageResource(R.drawable.hang_two);
                scoreText.setText(String.valueOf(score - 6));
                break;
            case 3:
                hangmanPicture.setImageResource(R.drawable.hang_three);
                scoreText.setText(String.valueOf(score - 9));
                break;
            case 4:
                Intent intent2 = new Intent(this, Main3Activity.class);
                intent2.putExtra("alive", 0);
                startActivity(intent2);
                break;

        }
    }
}
