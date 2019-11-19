package com.example.wireless_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String [] start={"Choose a starting point","Home","Work"};
    String [] Dest={"Choose a destination","Home","Work","super market" , "Restaurant","coffee shop" };
    String [] time={"Choose a time","00-06","07-08"," 09-11" , "12-16","17-20", "21-23" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,start);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Dest);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,time);

        Spinner s  = findViewById(R.id.start);
        s.setAdapter(arrayAdapter);

        Spinner d  = findViewById(R.id.dest);
        d.setAdapter(arrayAdapter1);

        Spinner t = findViewById(R.id.time);
        t.setAdapter(arrayAdapter2);





    }




}

