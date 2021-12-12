package com.example.finalproject;

public class Coins {
    String Coin_name;
    int image_id;
    String coin_cost;
    int desc_id1;
    String desc_text1;
    int desc_id2;
    String desc_text2;
    String phone_num;
    String Email_add;
    double Lat_num;
    double Lng_num;
    String coin_url;

    public Coins(int id, String name,String cost, int descid1,String desc1,int descid2,String desc2,String phone,String Email,double lat,double lng,String url){
        this.image_id=id;
        this.Coin_name=name;
        this.coin_cost=cost;
        this.desc_id1=descid1;
        this.desc_text1=desc1;
        this.desc_id2=descid2;
        this.desc_text2=desc2;
        this.phone_num=phone;
        this.Email_add=Email;
        this.Lat_num=lat;
        this.Lng_num=lng;
        this.coin_url=url;
    }
    public String getCoin_name(){
        return Coin_name;
    }
    public int getImage_id(){
        return image_id;
    }
    public String getCoin_cost(){
        return coin_cost;
    }
    public int getDesc_id1(){return desc_id1;}
    public String getDesc_text1(){return desc_text1;}
    public int getDesc_id2(){return desc_id2;}
    public String getDesc_text2(){return desc_text2;}
    public String getPhone_num(){return phone_num;}
    public String getEmail_add(){return Email_add;}
    public double getLat_num(){return Lat_num;}
    public double getLng_num(){return Lng_num;}
    public String getCoin_url(){return coin_url;
    }
}
