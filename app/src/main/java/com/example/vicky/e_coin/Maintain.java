package com.example.vicky.e_coin;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;

public class Maintain extends AppCompatActivity{
    EditText cname;
    EditText cardno;
    EditText mm;
    EditText yy;
    EditText cvv;


    MaterialEditText maintainatm;
    MaterialEditText maintainphone;
    MaterialEditText maintainmail;
    MaterialEditText maintainupi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintain);
        cardno =findViewById(R.id.cardno);
        cname =findViewById(R.id.cname);
        mm =findViewById(R.id.mm);
        yy =findViewById(R.id.yy);
        cvv =findViewById(R.id.cvv);
        maintainatm =findViewById(R.id.maintain_atm);
        maintainphone =findViewById(R.id.maintain_phone);
        maintainmail =findViewById(R.id.maintain_mail);
        maintainupi =findViewById(R.id.maintain_upi);

    }

    public void validatecard(View view){
        String cno = cardno.getText().toString();
        String cn = cname.getText().toString();
        String m = mm.getText().toString();
        String y =yy.getText().toString();
        String cv = cvv.getText().toString();
        int m1;
        int y1;
        int cv1;
        int flag =0;
        if(y.matches("")){y1=0;}else {y1 = Integer.parseInt(m);}
        if(m.matches("")){m1=0;}else {m1 = Integer.parseInt(m);}
        if(cv.matches("")){cv1=0;}else {cv1=Integer.parseInt(cv);}
        if(cno.length()<16){Toast.makeText(this, "Invalid card Number", Toast.LENGTH_SHORT).show();}
        else if(cn.length()<1){Toast.makeText(this, "Invalid Name", Toast.LENGTH_SHORT).show();}
        else if(m1>12 || m.equals("")){Toast.makeText(this, "Invalid Month", Toast.LENGTH_SHORT).show();}
        else if(y1>99 || y.equals("")){Toast.makeText(this, "Invalid year", Toast.LENGTH_SHORT).show();}
        else if(cv1>999 || cv.equals("")){Toast.makeText(this, "Invalid CVV", Toast.LENGTH_SHORT).show();}
        else{flag = flag+1;}
        if(flag==5){Toast.makeText(this, "Card accepted / added", Toast.LENGTH_SHORT).show();}else{Toast.makeText(this, "Card Denied", Toast.LENGTH_SHORT).show();}
    }

    public void validatedetails(View view){
        String pin = maintainatm.getText().toString();
        String mail=maintainmail.getText().toString();
        String phone = maintainphone.getText().toString();
        String upi = maintainupi.getText().toString();
        int flag=0;
        int pin1;
        if(pin.matches("")){
            pin1=0;
        }else {
            pin1 = Integer.parseInt(pin);
        }
        if(pin1>9999){
            Toast.makeText(this, "Invalid ATM-PIN", Toast.LENGTH_SHORT).show();
        }else {
            flag = flag+1;
        }
        if (mailCheck(mail)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid MAIN-ID", Toast.LENGTH_SHORT).show();
        }
        if (phoneCheck(phone)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid PHONE-NUMBER", Toast.LENGTH_SHORT).show();
        }
        if (upiCheck(upi)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
        }
        if (flag==4){
            Toast.makeText(this, "Details Added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Denied", Toast.LENGTH_SHORT).show();
        }

    }
    public static boolean mailCheck(String mail){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+(\\.[a-z]+)+";
        return (mail.matches(emailPattern));
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


