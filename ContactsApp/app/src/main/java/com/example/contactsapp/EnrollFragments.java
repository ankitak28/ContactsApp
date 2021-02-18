package com.example.contactsapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnrollFragments#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnrollFragments extends Fragment {

    public static final String TAG = EnrollFragments.class.getSimpleName();
    private EditText name;
    private EditText age;
    private EditText city;
    private EditText phone;
    private ImageView image;
    private Button submitButton;
    public EnrollFragments() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment EnrollFragments.
     */
    public static EnrollFragments newInstance(String param1, String param2) {
        EnrollFragments fragment = new EnrollFragments();
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
        // Inflate the layout for this fragment
        Log.d(TAG, "newInstance: onCreateView");
        View view = inflater.inflate(R.layout.enroll_fragments,container,false);
        name = view.findViewById(R.id.name_edittext);
        age = view.findViewById(R.id.age_edittext);
        city = view.findViewById(R.id.city_edittext);
        phone = view.findViewById(R.id.phone_edittext);
        image = view.findViewById(R.id.image_view);
        submitButton = view.findViewById(R.id.submit);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "newInstance: onViewCreated");
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contact contact = new Contact();
                contact.setName(name.getText().toString());
                contact.setAge(age.getText().toString());
                contact.setCity(city.getText().toString());
                contact.setPhone(phone.getText().toString());

                SharedPreferences sharedPreferences = getContext().getSharedPreferences("contacts",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(contact.toString(),"").commit();
                Log.d(TAG, "onClick: "+contact.toString());
                Toast.makeText(getContext(),"Contact Saved!",Toast.LENGTH_SHORT).show();
                name.setText("");
                age.setText("");
                phone.setText("");
                city.setText("");
            }
        });

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