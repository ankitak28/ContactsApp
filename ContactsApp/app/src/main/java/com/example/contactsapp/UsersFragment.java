package com.example.contactsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UsersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UsersFragment extends Fragment {

    public static final  String TAG = UsersFragment.class.getSimpleName();
    ListView listView_ ;
    ArrayList<Contact> contactsList;
    public UsersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment UsersFragment.
     */
    public static UsersFragment newInstance(String param1, String param2) {
        UsersFragment fragment = new UsersFragment();
        Log.d(TAG, "newInstance: newInstance");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "newInstance: onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "newInstance: onCreateView");
        View view = inflater.inflate(R.layout.fragment_users, container, false);
        listView_ = (ListView)view.findViewById(R.id.listview);
        contactsList = new ArrayList<>();
        contactsList.add(new Contact("Anki","dhanbad","22","female","8288815656"));
        contactsList.add(new Contact("Alka","dhanbad","23","female","8288815656"));
        contactsList.add(new Contact("Sweety","dhanbad","24","female","8288815656"));
        contactsList.add(new Contact("Rosy","dhanbad","28","female","8288815656"));
        contactsList.add(new Contact("Khusbu","dhanbad","29","female","8288815656"));
        contactsList.add(new Contact("Anki","dhanbad","22","female","8288815656"));
        contactsList.add(new Contact("Alka","dhanbad","23","female","8288815656"));
        contactsList.add(new Contact("Sweety","dhanbad","24","female","8288815656"));
        contactsList.add(new Contact("Rosy","dhanbad","28","female","8288815656"));
        contactsList.add(new Contact("Khusbu","dhanbad","29","female","8288815656"));

        contactsList.add(new Contact("Anki","dhanbad","22","female","8288815656"));
        contactsList.add(new Contact("Alka","dhanbad","23","female","8288815656"));
        contactsList.add(new Contact("Sweety","dhanbad","24","female","8288815656"));
        contactsList.add(new Contact("Rosy","dhanbad","28","female","8288815656"));
        contactsList.add(new Contact("Khusbu","dhanbad","29","female","8288815656"));

        CustomAdapter adapter = new CustomAdapter(getContext(),contactsList);

        listView_.setAdapter(adapter);

        // Inflate the layout for this fragment
          return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }

    @Override
    public void onAttachFragment(@NonNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.d(TAG, "newInstance: onAttachFragment");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "newInstance: onAttachFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "newInstance: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "newInstance: onViewCreated");


        Log.d(TAG, "onViewCreated: "+contactsList.size());

        Log.d(TAG, "newInstance: onResume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "newInstance: onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "newInstance: onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "newInstance: onDetach");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "newInstance: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "newInstance: onStop");
    }
}