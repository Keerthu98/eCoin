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


public class Prepaid extends Fragment {
    Button prepidonclick;
    MaterialEditText numberpre;
    MaterialEditText carrierpre;
    MaterialEditText amountpre;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_prepaid, container, false);
        numberpre =view.findViewById(R.id.prepaid_number);
        carrierpre =view.findViewById(R.id.carrier_pre);
        amountpre =view.findViewById(R.id.amount_pre);
        prepidonclick =view.findViewById(R.id.prepaidonclick);
        prepidonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String phoneregex = "^[2-9]{2}[0-9]{8}$";
                if (numberpre.getText().toString().matches(phoneregex)&&carrierpre.length()>0&& Integer.parseInt(amountpre.getText().toString())>=0){
                    Intent pregateway = new Intent(v.getContext(),GatewayOtp.class);
                    startActivity(pregateway);
                }else
                {Toast.makeText(getActivity(),"Invalid Fields",Toast.LENGTH_SHORT).show();}
            }
        });
        return view;
    }

}

