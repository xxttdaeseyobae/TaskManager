package com.example.taskmanager.url;

public class url {

    public static final String base_url = "http://172.100.100.5:3000/";
    //public static final String base_url = "http://10.0.2.2:3000/";
    //public static final String base_url = "http://192.168.1.11:3000/";

    public static String token="";
    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonCoverterFactory.create())
                .build();
        return retrofit;
    }
}