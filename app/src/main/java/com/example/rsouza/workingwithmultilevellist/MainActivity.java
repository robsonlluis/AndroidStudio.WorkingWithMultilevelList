package com.example.rsouza.workingwithmultilevellist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expListView = (ExpandableListView) findViewById(R.id.ParentLevel);
        expListView.setAdapter(new ParentLevel(MainActivity.this));
    }
}
