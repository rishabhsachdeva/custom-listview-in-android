package com.example.rishabhsachdeva.hpweb_listview_custom;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
String name[]={"india","china","japan","srilanka"};
    Integer img[]={R.drawable.india,R.drawable.sri_lanka_flag,R.drawable.india,R.drawable.sri_lanka_flag};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=(ListView)findViewById(R.id.customlistview);
lv.setAdapter(new CustomAdapter(MainActivity.this,name,img));


    }
}
