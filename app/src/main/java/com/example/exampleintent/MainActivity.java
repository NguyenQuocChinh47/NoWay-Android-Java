package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
   public static ArrayList arrayName;
    ImageView imgPicture1, imgPicture2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPicture1 = findViewById(R.id.img_Picture1);
        imgPicture2 = findViewById(R.id.img_Picture2);
        String[] name = getResources().getStringArray(R.array.list_name);
        arrayName = new ArrayList<>(Arrays.asList(name));
//        Random random = new Random();
//        int x = random.nextInt(7);
        Collections.shuffle(arrayName);
        int imgHinh = getResources().getIdentifier((String) arrayName.get(5), "drawable", getPackageName());
        imgPicture1.setImageResource(imgHinh);

        imgPicture2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}