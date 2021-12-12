package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_detail);
        Intent intent=getIntent();
        String item=intent.getExtras().getString("item");
        int logo=intent.getExtras().getInt("logo");
        String cost=intent.getExtras().getString("cost");
        int desc1=intent.getExtras().getInt("desc1");
        String descText1=intent.getExtras().getString("descText1");
        int desc2=intent.getExtras().getInt("desc2");
        String descText2=intent.getExtras().getString("descText2");
        String phone=intent.getExtras().getString("phone");
        String email=intent.getExtras().getString("email");
        double lat=intent.getExtras().getDouble("lat");
        double lng=intent.getExtras().getDouble("lng");
        String url=intent.getExtras().getString("url");
        //ArrayList<Coins> coindetail=(ArrayList<Coins>)getIntent().getSerializableExtra("detail");
        //int id=coindetail.get(position).getImage_id();
        //String coinName=coindetail.get(0).getCoin_name();
        //String cost=coindetail.get(position).getCoin_url();
        TextView textView=findViewById(R.id.textView4);
        ImageView imageView=findViewById(R.id.imageView3);
        TextView textView1=findViewById(R.id.textView5);
        ImageView imageView1=findViewById(R.id.imageView4);
        TextView textView2=findViewById(R.id.textView6);
        ImageView imageView2=findViewById(R.id.imageView5);
        TextView textView3=findViewById(R.id.textView7);
        ImageButton b1=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton b2=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton b3=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton b4=(ImageButton)findViewById(R.id.imageButton6);
        textView.setText(item);
        imageView.setImageResource(logo);
        textView1.setText(cost);
        imageView1.setImageResource(desc1);
        imageView2.setImageResource(desc2);
        textView2.setText(descText1);
        textView3.setText(descText2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(phone));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendEmail(email);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent=new Intent(context,MapsActivity.class);
                intent.putExtra("lat",lat);
                intent.putExtra("lng",lng);
                context.startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
    }


    protected void sendEmail(String email) {
        String[] TO = {email};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");
        try {
            startActivity(Intent.createChooser(emailIntent, "이메일 보내기..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(DisplayDetail.this, "이메일 클라이언트가 없네요.", Toast.LENGTH_SHORT).show();
        }
    }
}