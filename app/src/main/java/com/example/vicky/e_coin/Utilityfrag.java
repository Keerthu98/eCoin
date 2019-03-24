package com.example.vicky.e_coin;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Utilityfrag extends Fragment {
     static Button prepaid;
    Button postpaid1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_utilityfrag, container, false);
        prepaid =view.findViewById(R.id.prepaid);


        prepaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepaid.setVisibility(v.INVISIBLE);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.prepaid_container,new Prepaid());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }


}
