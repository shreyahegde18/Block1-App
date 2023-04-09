package com.shreyahegde.block;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.lifecycle.ViewTreeViewModelKt;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blue,maroon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue=(Button) findViewById(R.id.bluebutton);
        maroon=(Button) findViewById(R.id.marronbutton);
    }
    public void todo(View v){
        if (v.equals(blue))
            //invisibility
            v.setVisibility(v.INVISIBLE);
        if (v.equals(maroon))
            //pop up
            Toast.makeText(getApplicationContext(),"I Love Doge",Toast.LENGTH_SHORT).show();


    }

}