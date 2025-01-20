package com.example.animations;

import static com.example.animations.R.drawable.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TweenAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        ImageView img = findViewById(R.id.animationViewTwo);
        img.setImageResource(R.drawable.a1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
        img.startAnimation(animation);
        ((Button)findViewById(R.id.PreviewAnimation)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TweenAnimation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}