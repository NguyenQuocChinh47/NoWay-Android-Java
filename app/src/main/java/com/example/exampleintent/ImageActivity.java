package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.Collections;
import java.util.List;

public class ImageActivity extends AppCompatActivity {
    TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        tableLayout = findViewById(R.id.tableLayoutImage);
        int soDong = 4;
        int soCot  = 2;
        //tao column and row
        for(int i=0; i<=soDong; i++){
            TableRow tableRow = new TableRow(this);
            //tao row -> imageView
            for(int j=0; j<=soCot; i++){
                ImageView imageView = new ImageView(this);
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(50, 50);
                int imgHinh = getResources().getIdentifier((String) MainActivity.arrayName.get(1), "drawable", getPackageName() );
                imageView.setImageResource(imgHinh);
                //add imageView into tablerow
                tableRow.addView(imageView);
            }
            //add tablerow -> table
            tableLayout.addView(tableRow);
        }
    }
}