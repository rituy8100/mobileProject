package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView myPicture;
        TextView myText;
        TextView cost;

        MyViewHolder(View view){
            super(view);
            myPicture=view.findViewById(R.id.imageView);
            myText=view.findViewById(R.id.textView2);
            cost=view.findViewById(R.id.textView3);
        }
    }

    private ArrayList<Coins> myCoinList;

    MyAdapter(ArrayList<Coins> coins){
        this.myCoinList=coins;
    }

    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(v);
    }

    public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.myPicture.setImageResource(myCoinList.get(position).getImage_id());

        myViewHolder.myText.setText(myCoinList.get(position).getCoin_name());
        myViewHolder.cost.setText(myCoinList.get(position).getCoin_cost());

        myViewHolder.myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DisplayDetail.class);
                //ArrayList<Coins> coindetail=new ArrayList<Coins>();
                int logo=myCoinList.get(position).getImage_id();
                String item = myCoinList.get(position).getCoin_name().toString();
                String cost=myCoinList.get(position).getCoin_cost().toString();
                int desc1=myCoinList.get(position).getDesc_id1();
                String descText1=myCoinList.get(position).getDesc_text1();
                int desc2=myCoinList.get(position).getDesc_id2();
                String descText2=myCoinList.get(position).getDesc_text2();
                String phone=myCoinList.get(position).getPhone_num();
                String email=myCoinList.get(position).getEmail_add();
                double lat=myCoinList.get(position).getLat_num();
                double lng=myCoinList.get(position).getLng_num();
                String url=myCoinList.get(position).getCoin_url();
                //coindetail.add(new Coins(logo,item,cost));
                intent.putExtra("item", item);
                intent.putExtra("logo",logo);
                intent.putExtra("cost",cost);
                intent.putExtra("desc1",desc1);
                intent.putExtra("descText1",descText1);
                intent.putExtra("desc2",desc2);
                intent.putExtra("descText2",descText2);
                intent.putExtra("phone",phone);
                intent.putExtra("email",email);
                intent.putExtra("lat",lat);
                intent.putExtra("lng",lng);
                intent.putExtra("url",url);
                context.startActivity(intent);
            }
        });
    }
    public int getItemCount() {
        return myCoinList.size();
    }
}



