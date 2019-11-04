package com.example.user.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 2017-10-08.
 */

//서울로 이용안내 카테고리
public class MainGuide  extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.guide_main);

            Button call = (Button)findViewById(R.id.guidecall); //서울로 연락처
            Button ask = (Button)findViewById(R.id.guideask); //서울로 문의사항
            Button audio = (Button)findViewById(R.id.audio);//오디오가이드
            Button come = (Button)findViewById(R.id.come);//서울로 오시는길

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            //서울로 오시는길

            //서울로 연락처 화면 전환
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainGuide.this, CallActivity.class);
                    startActivity(intent);
                }
            });

            //서울로 문의사항 화면 전환
            ask.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eungdapso.seoul.go.kr/"));
                    startActivity(intent);
                }
            });

            //오디오 가이드
            audio.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(MainGuide.this, AudiioActivity.class);
                    startActivity(intent);
                }
            });

            come.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(MainGuide.this, DirectionsActivity.class);
                    startActivity(intent);
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
