package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart;
    private TextView turn,output;
    String turns="o";
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        btn9 = findViewById(R.id.b9);
        turn = findViewById(R.id.turn);
        output = findViewById(R.id.output);
        restart = findViewById(R.id.restart);

        restart.setVisibility(View.INVISIBLE);
        turn.setText(swap(turns)+" turn");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText(turns);
                disableButton(0);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText(turns);
                disableButton(1);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setText(turns);
                disableButton(2);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setText(turns);
                disableButton(3);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setText(turns);
                disableButton(4);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setText(turns);
                disableButton(5);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn7.setText(turns);
                disableButton(6);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn8.setText(turns);
                disableButton(7);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn9.setText(turns);
                disableButton(8);
                check(turns);
                turn.setText(swap(turns)+" turn");
                count++;
                draw();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enableButton();
            }
        });
    }
    public String swap(String s){
        turns= (s.equals("x"))?"o":"x";
        return turns;
    }
    public void check(String s){
        String b1 = btn1.getText().toString();
        String b2 = btn2.getText().toString();
        String b3 = btn3.getText().toString();
        String b4 = btn4.getText().toString();
        String b5 = btn5.getText().toString();
        String b6 = btn6.getText().toString();
        String b7 = btn7.getText().toString();
        String b8 = btn8.getText().toString();
        String b9 = btn9.getText().toString();

        if(b1.equals(s) && b2.equals(s) && b3.equals(s)){
            gameOver(s);
        }
        if(b1.equals(s) && b4.equals(s) && b7.equals(s)){
            gameOver(s);
        }
        if(b1.equals(s) && b5.equals(s) && b9.equals(s)){
            gameOver(s);
        }
        if(b4.equals(s) && b5.equals(s) && b6.equals(s)){
            gameOver(s);
        }
        if(b7.equals(s) && b8.equals(s) && b9.equals(s)){
            gameOver(s);
        }
        if(b2.equals(s) && b5.equals(s) && b8.equals(s)){
            gameOver(s);
        }
        if(b3.equals(s) && b6.equals(s) && b9.equals(s)){
            gameOver(s);
        }
        if(b3.equals(s) && b5.equals(s) && b7.equals(s)){
            gameOver(s);
        }
    }
    public void gameOver(String s){
            output.setText(s + " is winner ..");
            for (int i = 0; i < 9; i++) {
                disableButton(i);
            }
            turn.setVisibility(View.INVISIBLE);
            restart.setVisibility(View.VISIBLE);

    }
    public void disableButton(int i){
        Button btn[]={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
        btn[i].setEnabled(false);
    }
    public void enableButton(){
        Button btn[]={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
        for(int i=0;i<9;i++) {
            btn[i].setEnabled(true);
            btn[i].setText("");
        }
        turn.setVisibility(View.VISIBLE);
        turns = "o";
        output.setText("");
        restart.setVisibility(View.INVISIBLE);
    }
    public void draw(){
        if(count==9) {
            output.setText("Match Draw !!!");
            turn.setVisibility(View.INVISIBLE);
            restart.setVisibility(View.VISIBLE);
        }

    }

}