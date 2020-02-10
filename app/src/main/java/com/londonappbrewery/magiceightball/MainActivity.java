package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button = (Button) findViewById(R.id.askButton);
        final ImageView ball_img = (ImageView)findViewById(R.id.image_eightBall);

        final int[] image_array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random_generator = new Random();
                int random_number = random_generator.nextInt(5);
                //Log.d("ask","random broj je :" + random_number);
                ball_img.setImageResource(image_array[random_number]);
            }
        });
    }
}
