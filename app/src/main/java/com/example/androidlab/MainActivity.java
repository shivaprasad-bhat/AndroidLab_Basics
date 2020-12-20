package com.example.androidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidlab.lab2.ImageGalleryActivity;
import com.example.androidlab.lab2.OptionMenu;

/**
 * Android lab activities
 *
 * @author Shivaprasad Bhat
 * @date 20-12-2020
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Android LifeCycle", "onCrete() Called");

        /**
         * Method that generates a toast message on click
         * Lab1 - Exercise 1
         */
        Button btnGenerateToast = (Button) findViewById(R.id.btnGenerateToast);
        btnGenerateToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on Generate Toast Button", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * List View Example
         * Lab1 - Exercise 3
         */
        Button btnListView = (Button) findViewById(R.id.btnListView);
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listView = new Intent(MainActivity.this, ActivityListView.class);
                startActivity(listView);
            }
        });

        /**
         * Image Gallery
         * Lab2 - Exercise 1
         */
        Button btnImageGallery = (Button) findViewById(R.id.btnImageGallery);
        btnImageGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageGallery = new Intent(MainActivity.this, ImageGalleryActivity.class);
                startActivity(imageGallery);
            }
        });

        /**
         * Option Menu
         * Lab2 - Exercise 2
         */
        Button btnOptionMenu = (Button) findViewById(R.id.btnOptionMenu);
        btnOptionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent options = new Intent(MainActivity.this, OptionMenu.class);
                startActivity(options);
            }
        });
    }

    /**
     * Android lifecycle methods
     * Lab1 - Exercise 2
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Android LifeCycle", "onDestroy() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Android LifeCycle", "onStart() Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Android LifeCycle", "onRestart() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Android LifeCycle", "onResume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Android LifeCycle", "onPause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Android LifeCycle", "onStop() Called");
    }
}