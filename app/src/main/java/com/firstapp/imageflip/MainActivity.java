package com.firstapp.imageflip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button up = findViewById(R.id.up);
        Button right = findViewById(R.id.right);
        Button left = findViewById(R.id.left);
        Button down = findViewById(R.id.down);
        ImageView img = findViewById(R.id.image);
        BitmapDrawable mImageDrawable = (BitmapDrawable) img.getDrawable();

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setRotation(0);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setRotation(180);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setRotation(-90);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setRotation(90);
            }
        });
    }

}