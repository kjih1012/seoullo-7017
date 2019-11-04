package com.example.user.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AudiioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void qr_info(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://me2.do/Gqi6KWiq"));
        startActivity(intent);

    }

    public void qr_smart(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=kto.smarttour"));
        startActivity(intent);

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
