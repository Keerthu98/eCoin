package com.example.vicky.e_coin;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Utilityfrag1 extends Fragment {
    Button postpaid;
    Button prepaid1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_utilityfrag1, container, false);
        postpaid =view.findViewById(R.id.postpaid);


        postpaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postpaid.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.postpaid_container,new Postpaid());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }


}
