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


public class Postpaid extends Fragment {

    Button postpaidonclick;
    MaterialEditText numberpos;
    MaterialEditText carrier;
    MaterialEditText billno;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_postpaid, container, false);
        numberpos =view.findViewById(R.id.postpaid_number);
        carrier =view.findViewById(R.id.carrier);
        billno =view.findViewById(R.id.bill_no);
        postpaidonclick =view.findViewById(R.id.postpaidonclick);
        postpaidonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(entryOk(numberpos.getText().toString(),carrier.toString(),billno.toString())){
                    Intent posgateway = new Intent(v.getContext(),GatewayOtp.class);
                    startActivity(posgateway);
                }else
                {Toast.makeText(getActivity(), "Invalid Entries", Toast.LENGTH_SHORT).show();}
            }
        });
        return view;
    }
    public static boolean entryOk(String phone, String carrier, String bill){
        String phone_regex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phone_regex)&&carrier.length()>0&&bill.length()>0);
    }

}
