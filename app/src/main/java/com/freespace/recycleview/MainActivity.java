package com.freespace.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.freespace.recycleview.adapter.ContactAdapter.ContactAdapter;
import com.freespace.recycleview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Contact> contactList=new ArrayList<>();
private RecyclerView myrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        addDummyData();
        myrecyclerView=findViewById(R.id.myrecycleview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        myrecyclerView.setLayoutManager(layoutManager);
        myrecyclerView.setAdapter(new ContactAdapter(this, contactList));

    }

    private void addDummyData() {
        Contact contact=new Contact(R.drawable.ic_user,"9969336649", "Sagar Adkhale");
        contactList.add(contact);

         contact=new Contact(R.drawable.ic_user,"9969346649", "Raja Adkhale");
        contactList.add(contact);

         contact=new Contact(R.drawable.ic_user,"9969346649", "Shubham kadam");
        contactList.add(contact);

         contact=new Contact(R.drawable.ic_user,"9469336649", "Aniket Adkhale");
        contactList.add(contact);

         contact=new Contact(R.drawable.ic_user,"9945336649", "Pranjal Adkhale");
        contactList.add(contact);

    }
}
