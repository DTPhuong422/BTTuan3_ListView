package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("Nguyen Van A","0987876573", "RED");
        Contact contact2 = new Contact("Nguyen Van B","0987768990", "RED");
        Contact contact3 = new Contact("Nguyen Van C","0987653133", "RED");
        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.item_listview, arrContact);
        lvContact.setAdapter(adapter);
    }
}