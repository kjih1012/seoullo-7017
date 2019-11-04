package com.example.user.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manridong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manridong);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button btn1 = (Button) findViewById(R.id.manlidongButton);
        Button btn2 = (Button) findViewById(R.id.son);
        Button btn3 = (Button) findViewById(R.id.moon);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(manridong.this, manridong.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.sonkeechung.com/wordpress/"));
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("https://www.seoul284.org/"));
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
