package com.example.madass3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class mainactivity2 extends AppCompatActivity {

    private RecyclerView myRecyclerview;
    private TextView conn;
    private TextView connum;
    private TextView conm;
    private ArrayList<Contact> mContact=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Add text
        conn=(TextView)findViewById(R.id.contactname);
        connum=(TextView)findViewById(R.id.contactnumber);
        conm=(TextView)findViewById(R.id.contactemail);
        Intent i=getIntent();
        String conna=i.getStringExtra("Name");
        String connu=i.getStringExtra("Number");
        String conma=i.getStringExtra("E-mail");
        conn.setText(conna);
        connum.setText(connu);
        conm.setText(conma);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        LinearLayoutManager mLayoutmanager =new LinearLayoutManager(this);
        mLayoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        myRecyclerview.setLayoutManager(mLayoutmanager);
        //Create List

        mContact.add(new Contact("Alex sin",R.drawable.ic_add));
        mContact.add(new Contact("Anna",R.drawable.ic_add));
        mContact.add(new Contact("Omaima Ali",R.drawable.omaima));
        mContact.add(new Contact("John",R.drawable.ic_add));
        mContact.add(new Contact("Anum Aamir",R.drawable.anum));
        mContact.add(new Contact("Aqsa Aziz",R.drawable.aqsa));
        mContact.add(new Contact("Aisha Sultan",R.drawable.aisha));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        //Set Adapter
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}
