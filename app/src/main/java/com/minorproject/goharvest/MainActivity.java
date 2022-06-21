package com.minorproject.goharvest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fert = (Button) findViewById(R.id.fertilizerpredict);
        Button crop = (Button) findViewById(R.id.croppredict);
        fert.requestFocusFromTouch();
        crop.requestFocusFromTouch();
    }
    public void cropprediction( View v){
        Intent intent= new Intent(this, CropPrediction.class);
        startActivity(intent);
    }

    public void fertilizerprediction( View v){
        Intent intent= new Intent(this, FertilizerPrediction.class);
        startActivity(intent);
    }
}