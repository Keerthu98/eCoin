package com.example.vicky.e_coin;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.rengwuxian.materialedittext.MaterialEditText;

public class UpiIdTrans extends Fragment {

    Button upitrans;
    Button cancelupi;
    MaterialEditText valueupi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upi_id_trans, container, false);

        upitrans =view.findViewById(R.id.upitransonclick);
        cancelupi =view.findViewById(R.id.cancel_upi);
        valueupi =view.findViewById(R.id.upitrans);
        upitrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(upiCheck(valueupi.getText().toString())){
                Intent toupigateway = new Intent(getActivity(),Moneytrans.class);
                startActivity(toupigateway);}else {
                    Toast.makeText(getActivity(), "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelupi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeupi = new Intent(getActivity(),Recycler.class);
                startActivity(homeupi);
            }
        });
        return view;
    }

    public static boolean upiCheck(String upi){
        String upi_regex = "([\\w.-]+[@][\\w]+)";
        return (upi.matches(upi_regex));
    }


}
