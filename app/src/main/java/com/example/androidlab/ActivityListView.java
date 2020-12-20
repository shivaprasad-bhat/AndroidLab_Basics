package com.example.androidlab;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class ActivityListView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.user_list);
        lv.setAdapter(new CustomListAdapter(this, userList));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListItem user = (ListItem) lv.getItemAtPosition(position);
                Toast.makeText(ActivityListView.this, "Selected :" + " " +
                        user.getName() + ", " + user.getLocation(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<>();
        ListItem user1 = new ListItem();
        user1.setName("Amith");
        user1.setDesignation("Manager");
        user1.setLocation("Mangaluru");
        results.add(user1);
        ListItem user2 = new ListItem();
        user2.setName("Chandan");
        user2.setDesignation("Team Lead");
        user2.setLocation("Manipal");
        results.add(user2);
        ListItem user3 = new ListItem();
        user3.setName("Utsav");
        user3.setDesignation("Analyst");
        user3.setLocation("Bengaluru");
        results.add(user3);
        return results;
    }
}
