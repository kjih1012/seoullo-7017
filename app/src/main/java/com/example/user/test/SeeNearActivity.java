package com.example.user.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeeNearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_near);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button btn1 = (Button) findViewById(R.id.jonlimdongButton);
        Button btn2 = (Button) findViewById(R.id.cheongpadongButton);
        Button btn3 = (Button) findViewById(R.id.manlidongButton);
        Button btn4 = (Button) findViewById(R.id.huihyeondongButton);
        Button btn5 = (Button) findViewById(R.id.namdeamunbutton);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SeeNearActivity.this, JonlimActivity.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SeeNearActivity.this, CheongpaActivity.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SeeNearActivity.this, huihyeonActivity.class);
                startActivity(i);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SeeNearActivity.this, namdeamunActivity.class);
                startActivity(i);
            }
        });
    }

    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:

                // NavUtils.navigateUpFromSameTask(this);

                finish();

                return true;

        }

        return super.onOptionsItemSelected(item);




    };

}