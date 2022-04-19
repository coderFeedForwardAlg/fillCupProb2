package com.example.fillcupprob2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


    // TODO: make an object where you pass in an array of buckit values and it make the buckets.
public class fillCupPuzzleOne extends PuzzleActivity {

    TextView textView;

    Button fillButton;
    Button emptyButton;

    Button fiveUnitButton;
    Button threeUnitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        fillButton = findViewById(R.id.fill);
        emptyButton = findViewById(R.id.empty);

        fiveUnitButton = findViewById(R.id.fiveUnitCUp);
        threeUnitButton = findViewById(R.id.threeUnitCup);
            //set the number the player will win with
        Jug.setDesiredNumber(2);

        Jug jugFive = new Jug(5, fiveUnitButton);
        Jug jugThree = new Jug(3, threeUnitButton);

        fillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jug.setToFill();
            }
        });

        emptyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jug.setToEmpty();
            }
        });

        fiveUnitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugFive.ifClicked();
                    // TODO: put in Jug class
                if(jugFive.currentAmount == jugFive.desiredNumber || jugThree.currentAmount == jugThree.desiredNumber){
                    Intent intent = new Intent(getApplicationContext(), win.class);
                    startActivity(intent);
                }
            }
        });

        threeUnitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugThree.ifClicked();
                    // TODO: put in Jug class
                if(jugFive.currentAmount == jugFive.desiredNumber || jugThree.currentAmount == jugThree.desiredNumber){
                    Intent intent = new Intent(getApplicationContext(), win.class);
                    startActivity(intent);
                }
            }
        });



    }
}