package com.example.user.test;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 2017-10-26.
 */

public class CallActivity extends AppCompatActivity {
    private final int Call1Guide = 1;
    private final int Call2Guide = 2;

    Button call1,call2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        call1 = (Button)findViewById(R.id.call1);
        call2 = (Button)findViewById(R.id.call2);

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callFragment(Call1Guide);
            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callFragment(Call2Guide);
            }
        });

    }
    private void callFragment(int frament_no) {

        // 프래그먼트 사용을 위해
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (frament_no) {
            case 1:
                // '프래그먼트1' 호출
                Call1Guide fragment1 = new Call1Guide();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                // '프래그먼트2' 호출
                Call2Guide fragment2 = new Call2Guide();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;
        }
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
