package com.company.nitinkodialbail.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public  void makeToast(String str){
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view){
        EditText numberEnteredText = (EditText) findViewById(R.id.numberEditText);
        Integer numEntered = Integer.parseInt(numberEnteredText.getText().toString());

        if(numEntered<randomNumber){
            makeToast("Higher!");

        }
        else if(numEntered>randomNumber){
            makeToast("Lower!");

        }
        else{
            makeToast("Correct answer!");

            //Generate random number between 1 and 20
            Random rand =  new Random();
            randomNumber = rand.nextInt(20) + 1;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Generate random number between 1 and 20
        Random rand =  new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
