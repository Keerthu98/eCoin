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

public class AtmTrans extends Fragment {
Button tranatm;
Button cancelatm;
MaterialEditText atmpin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_atm_trans, container, false);
        tranatm = view.findViewById(R.id.atmtransonclick);
        cancelatm  =view.findViewById(R.id.cancel_atm);
        atmpin =view.findViewById(R.id.atmtrans);
        tranatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valueatm = Integer.parseInt(atmpin.getText().toString());
                if (pinCheck(valueatm)){
                    Toast.makeText(getActivity(), "Invalid Pin", Toast.LENGTH_SHORT).show();
                }else
                {Intent toatmgateway = new Intent(getActivity(),Moneytrans.class);
                startActivity(toatmgateway);}
            }
        });

        cancelatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeatm = new Intent(getActivity(),Recycler.class);
                startActivity(homeatm);
            }
        });
        return view;
    }
    public static boolean pinCheck(int value){
        return (value>9999);
    }
}
