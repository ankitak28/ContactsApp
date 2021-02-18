package com.example.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    private ArrayList<Contact> contacts;
    Context mContext;
    public CustomAdapter(@NonNull Context context, @NonNull ArrayList<Contact> objects) {
        super(context,R.layout.listitem,objects);
        this.mContext = context;
        this.contacts = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            LayoutInflater li;
            li = LayoutInflater.from(getContext());
            convertView = li.inflate(R.layout.listitem, null);
        }
        Contact contact =contacts.get(position);
        if(contact != null) {
            TextView name = convertView.findViewById(R.id.list_name);
            TextView age = convertView.findViewById(R.id.list_age);
            TextView gender = convertView.findViewById(R.id.list_gender);
            TextView city = convertView.findViewById(R.id.list_city);
            name.setText(contact.getName());
            age.setText(contact.getAge());
            gender.setText(contact.getGender());
            city.setText(contact.getCity());
        }
        return convertView;
    }

    @Nullable
    @Override
    public Contact getItem(int position) {
        return contacts.get(position);
    }
}
