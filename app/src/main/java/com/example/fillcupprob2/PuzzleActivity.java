//superclass for the puzzles

package com.example.fillcupprob2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PuzzleActivity extends AppCompatActivity {
    int puzzleType; //1: Chess 2: Fill Cup 3: River 4: Syllogism 5: Truth
    int puzzleCode; //0-4, will not repeat within puzzle types
    String question;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public void updatePuzzle(boolean response){
        if (response){
            //send to completed
        } else {
            //send to attempted
        }
    }
}
