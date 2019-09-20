package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button playButton;
    TextView newGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.button);
        newGame = findViewById(R.id.textView);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();
            }
        });
    }

//    This will go the main game page
//    I used a generic "theGame" to refer to the actual game
    public void startGame(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
