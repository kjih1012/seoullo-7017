package com.example.user.test;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

//서울로 주요업무별 전화번호
public class Call2Guide extends Fragment {
    ImageButton num1, num2, num3, num4, num5, num6,num7,num8;

    public Call2Guide() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.guide_call2, container, false);


        //서울로 안내소
        num1 = (ImageButton)view.findViewById(R.id.info);
        //서울로 가게
        num2 = (ImageButton)view.findViewById(R.id.store);
        //서울로 여행자카페
        num3 = (ImageButton)view.findViewById(R.id.tourist);
        //목련다방
        num4 = (ImageButton)view.findViewById(R.id.magCafe);
        //수국식빵
        num5 = (ImageButton)view.findViewById(R.id.bread);
        //장미빙수
        num6 = (ImageButton)view.findViewById(R.id.roseIce);
        //7017 서울화반
        num7 = (ImageButton)view.findViewById(R.id.flowerpot);
        //도토리풀빵
        num8 = (ImageButton)view.findViewById(R.id.acorn);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel = "tel:02-312-9575"; //서울로 안내소
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel2 = "tel:02-312-9836"; //서울로 가게
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel2)));
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel3 = "tel:02-312-8340"; //서울로 여행자카페
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel3)));
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel4 = "tel:02-312-5170"; //목련다방
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel4)));
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel5 = "tel:02-312-4714"; //수국식빵
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel5)));
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel6 = "tel:02-312-4971"; //장미빙수
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel6)));
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel7 = "tel:02-312-1697"; //7017 서울화반
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel7)));
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel8 = "tel:02-312-1892"; //도토리풀빵
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel8)));
            }
        });

        return view;

    }
}
