package com.example.project1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView scoreView;
    TextView feedback;
    ImageView hangman;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        scoreView = findViewById(R.id.textView3_3);
        hangman = findViewById(R.id.imageView2_3);
        feedback = findViewById(R.id.textView4_3);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int score = extras.getInt("score");
        int alive = extras.getInt("alive");
        if (alive == 1) {
            hangman.setImageResource(R.drawable.hangstart);
            feedback.setText(R.string.alive);
            scoreView.setText(String.valueOf(score));
        }
        else{
            hangman.setImageResource(R.drawable.hang_four);
            feedback.setText(R.string.dead);
            scoreView.setText("0");
        }
    }
    public void onClickGoHome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void playAgain(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
