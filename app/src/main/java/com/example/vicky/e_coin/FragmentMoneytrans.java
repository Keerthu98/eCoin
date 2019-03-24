package com.example.vicky.e_coin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentMoneytrans extends Fragment {
    ImageView upiid;
    ImageView atm;
    ImageView phone;
    ImageView mail;
    TextView info;


    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_fragment_moneytrans, container, false);
        upiid = view.findViewById(R.id.upiid);
        atm = view.findViewById(R.id.atm);
        phone = view.findViewById(R.id.phone);
        mail = view.findViewById(R.id.mailid);
        info =view.findViewById(R.id.info);
        upiid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_check_container,new UpiIdTrans());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_check_container,new AtmTrans());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_check_container,new Phonetrans());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_check_container,new MailTrans());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });



        return view;
    }

}
