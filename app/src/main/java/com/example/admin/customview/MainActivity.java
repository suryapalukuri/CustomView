package com.example.admin.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
 ListView listView;
 String []arr={"Mumbai","Benglore","Srinagar","Hyderabad"};
 int []imag={R.drawable.sunny,R.drawable.cloudy,R.drawable.snowing,R.drawable.storm};
 String []arr1={"Sunny","Cloudy","Snowing","Storm"};
 String []tempera={"40C","20C","5C","10C"};
 String []info={"touch on sunny","touch on cloudy","touch on snowing","touch on storm"};
 ArrayAdapter<String> adapter;
 CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        customAdapter =new CustomAdapter(this,arr,imag,arr1,tempera);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { Toast.makeText(MainActivity.this,info[i],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
