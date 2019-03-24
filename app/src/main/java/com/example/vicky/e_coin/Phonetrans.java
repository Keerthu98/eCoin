package com.example.vicky.e_coin;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;


public class Phonetrans extends Fragment {

    Button transphone;
    Button cancelphone;
    MaterialEditText valuephone;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phone_trans, container, false);
        transphone =view.findViewById(R.id.phonetransonclick);
        cancelphone =view.findViewById(R.id.cancel_phone);
        valuephone =view.findViewById(R.id.phonetrans);
        transphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(phoneCheck(valuephone.getText().toString())){
                Intent tophonegateway = new Intent(getActivity(),Moneytrans.class);
                startActivity(tophonegateway);}else {
                    Toast.makeText(getActivity(),"Invalid Phone Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homephone = new Intent(getActivity(),Recycler.class);
                startActivity(homephone);
            }
        });
        return view;
    }
    public static boolean phoneCheck(String phone){
        String phoneregex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phoneregex));
    }


}
