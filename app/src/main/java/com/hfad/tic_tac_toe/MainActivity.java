package com.hfad.tic_tac_toe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public String message;
    public String p1 = "Player 1 Wins";
    public String p2 = "Player 2 Wins";
    public String p3 = "Draw";



    public static int count = 1;
    public static int win = 0;
    public static int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = findViewById(R.id.b1);
        final Button b2 = findViewById(R.id.b2);
        final Button b3 = findViewById(R.id.b3);
        final Button b4 = findViewById(R.id.b4);
        final Button b5 = findViewById(R.id.b5);
        final Button b6 = findViewById(R.id.b6);
        final Button b7 = findViewById(R.id.b7);
        final Button b8 = findViewById(R.id.b8);
        final Button b9 = findViewById(R.id.b9);
        final Button b10 = findViewById(R.id.b10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[0][0] == 0) && (win == 0)) {
                    b1.setTextColor(Color.parseColor("#c40000"));
                    b1.setText("X");
                    state[0][0] = 1;
                    wincheck(state);
                    count++;
                } else if ((count % 2 == 0) && (state[0][0] == 0) && (win == 0)) {
                    b1.setTextColor(Color.parseColor("#22a12f"));
                    b1.setText("O");
                    state[0][0] = 2;
                    wincheck(state);
                    count++;
                } else if (win == 1) {

                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[0][1] == 0) && (win == 0)) {
                    b2.setTextColor(Color.parseColor("#c40000"));
                    b2.setText("X");
                    state[0][1] = 1;
                    wincheck(state);
                    count++;
                } else if ((count % 2 == 0) && (state[0][1] == 0) && (win == 0)) {
                    b2.setTextColor(Color.parseColor("#22a12f"));
                    b2.setText("O");
                    state[0][1] = 2;
                    wincheck(state);
                    count++;
                } else if (win == 1) {

                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[0][2] == 0) && (win == 0)) {
                    b3.setTextColor(Color.parseColor("#c40000"));
                    b3.setText("X");
                    state[0][2] = 1;
                    wincheck(state);
                    count++;
                } else if ((count % 2 == 0) && (state[0][2] == 0) && (win == 0)) {
                    b3.setTextColor(Color.parseColor("#22a12f"));
                    b3.setText("O");
                    state[0][2] = 2;
                    wincheck(state);
                    count++;
                } else if (win == 1) {

                }

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[1][0] == 0) && (win == 0)) {
                    b4.setTextColor(Color.parseColor("#c40000"));
                    b4.setText("X");
                    state[1][0] = 1;
                    wincheck(state);
                    count++;
                } else if ((count % 2 == 0) && (state[1][0] == 0) && (win == 0)) {
                    b4.setTextColor(Color.parseColor("#22a12f"));
                    b4.setText("O");
                    state[1][0] = 2;
                    wincheck(state);
                    count++;
                } else if (win == 1) {

                }

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[1][1] == 0) && (win == 0)) {
                    b5.setTextColor(Color.parseColor("#c40000"));
                    b5.setText("X");
                    state[1][1] = 1;
                    wincheck(state);
                    count++;


                } else if ((count % 2 == 0) && (state[1][1] == 0) && (win == 0)) {
                    b5.setTextColor(Color.parseColor("#22a12f"));
                    b5.setText("O");
                    state[1][1] = 2;
                    wincheck(state);
                    count++;

                } else if (win == 1) {

                }


            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[1][2] == 0) && (win == 0)) {
                    b6.setTextColor(Color.parseColor("#c40000"));
                    b6.setText("X");
                    state[1][2] = 1;
                    wincheck(state);
                    count++;


                } else if ((count % 2 == 0) && (state[1][2] == 0) && (win == 0)) {
                    b6.setTextColor(Color.parseColor("#22a12f"));
                    b6.setText("O");
                    state[1][2] = 2;
                    wincheck(state);
                    count++;

                } else if (win == 1) {

                }

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[2][0] == 0) && (win == 0)) {
                    b7.setTextColor(Color.parseColor("#c40000"));
                    b7.setText("X");
                    state[2][0] = 1;
                    wincheck(state);
                    count++;

                } else if ((count % 2 == 0) && (state[2][0] == 0) && (win == 0)) {
                    b7.setTextColor(Color.parseColor("#22a12f"));
                    b7.setText("O");
                    state[2][0] = 2;
                    wincheck(state);
                    count++;

                } else if (win == 1) {

                }

            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[2][1] == 0) && (win == 0)) {
                    b8.setTextColor(Color.parseColor("#c40000"));
                    b8.setText("X");
                    state[2][1] = 1;
                    wincheck(state);
                    count++;

                } else if ((count % 2 == 0) && (state[2][1] == 0) && (win == 0)) {
                    b8.setTextColor(Color.parseColor("#22a12f"));
                    b8.setText("O");
                    state[2][1] = 2;
                    wincheck(state);
                    count++;

                } else if (win == 1) {

                }

            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((count % 2 == 1) && (state[2][2] == 0) && (win == 0)) {
                    b9.setTextColor(Color.parseColor("#c40000"));
                    b9.setText("X");
                    state[2][2] = 1;
                    wincheck(state);
                    count++;

                } else if ((count % 2 == 0) && (state[2][2] == 0) && (win == 0)) {
                    b9.setTextColor(Color.parseColor("#22a12f"));
                    b9.setText("O");
                    state[2][2] = 2;
                    wincheck(state);
                    count++;

                } else if (win == 1) {

                }

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");

                state = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
                win = 0;
                count=1;
            }
        });


    }

    public void wincheck(int[][] a) {


        //horizontal win
        if ((state[0][0] == 1) && (state[0][1] == 1) && (state[0][2] == 1) && (win == 0)) {
            message=p1;
            win=1;

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if(((state[0][0] == 2) && (state[0][1] == 2) && (state[0][2] == 2) && (win == 0))){
            message=p2;
            win=1;

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if(((state[1][0] == 1) && (state[1][1] == 1) && (state[1][2] == 1) && (win == 0))){
            message=p1;
            win=1;

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if(((state[1][0] == 2) && (state[1][1] == 2) && (state[1][2] == 2) && (win == 0))){
            message=p2;
            win=1;

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if(((state[2][0] == 1) && (state[2][1] == 1) && (state[2][2] == 1) && (win == 0))){
            message=p1;
            win=1;

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if((state[2][0] == 2) && (state[2][1] == 2) && (state[2][2] == 2) && (win == 0)){
            message=p2;
            win=1;


            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }


        //vertical win
        if ((state[0][0] == 1) && (state[1][0] == 1) && (state[2][0] == 1) && (win == 0)) {
            message=p1;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);

        }

        if ((state[0][0] == 2) && (state[1][0] == 2) && (state[2][0] == 2) && (win == 0)) {
            message=p2;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if ((state[0][1] == 1) && (state[1][1] == 1) && (state[2][1] == 1) && (win == 0)) {
            message=p1;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }


        if ((state[0][1] == 2) && (state[1][1] == 2) && (state[2][1] == 2) && (win == 0)) {
            message=p2;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }


        if ((state[0][2] == 1) && (state[1][2] == 1) && (state[2][2] == 1) && (win == 0)) {
            message=p1;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if ((state[0][2] == 2) && (state[1][2] == 2) && (state[2][2] == 2) && (win == 0)) {
            message=p2;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        //diagonal win
        if ((state[0][0] == 1) && (state[1][1] == 1) && (state[2][2] == 1) && (win == 0)) {
            message=p1;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if ((state[0][0] == 2) && (state[1][1] == 2) && (state[2][2] == 2) && (win == 0)) {
            message=p2;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if ((state[0][2] == 1) && (state[1][1] == 1) && (state[2][0] == 1) && (win == 0)) {
            message=p1;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }

        if ((state[0][2] == 2) && (state[1][1] == 2) && (state[2][0] == 2) && (win == 0)) {
            message=p2;
            win=1;
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);
        }


        //Draw situation

        if ((count == 9)) {
            message=p3;
            win=2;    //draw

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("value1", message);
            startActivity(intent);

        }
    }









}

