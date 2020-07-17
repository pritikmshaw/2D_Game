package com.example.birdshooter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point point =new Point();
        getWindowManager().getDefaultDisplay().getSize(point);

        gameView= new GameView(this, point.x, point.y);
        setContentView(gameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause(); // to pause the game
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume(); // to resume the game

    }
}