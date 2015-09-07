package com.personal.listviewtest;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


/**
 * 原文地址: http://blog.csdn.net/guolin_blog/article/details/45586553
 * @author guolin
 */
public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        ImageAdapter adapter = new ImageAdapter(this, 0, Images.imageUrls);
//        ImageAdapter adapter = new ImageAdapter(this, 0, Images.imageThumbUrls);
        listView.setAdapter(adapter);
    }


}
