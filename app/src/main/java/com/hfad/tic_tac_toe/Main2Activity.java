package com.hfad.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final TextView winner = findViewById(R.id.winmsg);
        final Button b11 = findViewById(R.id.b11);




        Intent intent = getIntent();
        Bundle bd = intent.getExtras();

        String getwinner = (String) bd.get("value1");

        winner.setText(getwinner);


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.state = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
                MainActivity.win = 0;
                MainActivity.count=0;



                Intent intent2 = new Intent( Main2Activity.this,MainActivity.class);
                startActivity(intent2);

            }


        });




    }




}

