package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Moneytrans extends AppCompatActivity {
    Button pay;
    EditText amount;
    EditText regmobile;
    EditText recipient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneytrans);
        pay =findViewById(R.id.pay);
        amount =findViewById(R.id.amount);
        regmobile =findViewById(R.id.regmobile);
        recipient =findViewById(R.id.recipient);
    }

    public void payment(View view){String amt = amount.getText().toString();
        String phone = regmobile.getText().toString();
        String upi = recipient.getText().toString();
        int flag=0;
        int amt1;
        if(amt.matches("")){
            amt1=0;
        }else
        {
            amt1 = Integer.parseInt(amt);
        }
        if(amt1<0){
            Toast.makeText(this, "Invalid Amount", Toast.LENGTH_SHORT).show();
        }else {
            flag = flag+1;
        }
        if (phoneCheck(phone)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid Phone", Toast.LENGTH_SHORT).show();
        }
        if (upiCheck(upi)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
        }
        if(flag==3){
        Intent gateway = new Intent(view.getContext(),GatewayOtp.class);
        gateway.putExtra("regmobile",regmobile.getText().toString());
        startActivity(gateway);}
        else {
            Toast.makeText(this, "Payment Denied due to invalid fields", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean phoneCheck(String phone){
        String phone_regex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phone_regex));
    }

    public static boolean upiCheck(String upi){
        String upi_regex = "([\\w.-]+[@][\\w]+)";
        return (upi.matches(upi_regex));
    }
}