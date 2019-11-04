package com.example.user.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cheongpa_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheongpa_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
