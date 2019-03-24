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


public class MailTrans extends Fragment {
    Button tranmail;
    Button cancelmail;
    MaterialEditText valuemail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mail_trans, container, false);

        tranmail=view.findViewById(R.id.mailtransonclick);
        cancelmail =view.findViewById(R.id.cancel_mail);
        valuemail =view.findViewById(R.id.mailtrans);


        tranmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=valuemail.getText().toString();
                if(mailCheck(mail)){
                Intent tomailgateway = new Intent(getActivity(),Moneytrans.class);
                startActivity(tomailgateway);}else {
                    Toast.makeText(getActivity(), "Invalid Mail-ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homemail = new Intent(getActivity(),Recycler.class);
                startActivity(homemail);
            }
        });

        return view;
    }
    public static boolean mailCheck(String mail){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+(\\.[a-z]+)+";
        return (mail.matches(emailPattern)&& mail.length()>0);
    }


}
