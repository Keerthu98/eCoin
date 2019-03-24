package com.example.vicky.e_coin;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Random;
import java.util.logging.Logger;

public class GatewayOtp extends AppCompatActivity {
        private static final int REQUEST_READ_PHONE_STATE = 1;
        static final int SENDPERMISSIONREQUESTCODE = 1;
        TextView mobile;
        Button sendotp;
        MaterialEditText otp;
    Random n = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gateway_otp);
        if(checkPermission(Manifest.permission.SEND_SMS)){
            Logger.getLogger("send_sms");
        }else{
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.SEND_SMS},SENDPERMISSIONREQUESTCODE);
        }
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_READ_PHONE_STATE);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int count = 0; count<=5;count++){
            stringBuilder.append(n.nextInt(10));
        }
        final String value_n = stringBuilder.toString();
        mobile =findViewById(R.id.mobile);
        sendotp =findViewById(R.id.otpsend);
        otp =findViewById(R.id.otp);
        Bundle b =getIntent().getExtras();
        String regmobile = b.getString("regmobile");
        mobile.setText("Mobile:XXXXXXXX"+regmobile.substring(regmobile.length()-2));
        if(checkPermission(Manifest.permission.SEND_SMS)){
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(regmobile, null, "OTP for this transaction is"+value_n, null, null);

        }

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueotp = otp.getText().toString();
                if (valueotp.equals(value_n)){
                    Toast.makeText(GatewayOtp.this, "Connection TO Gateway", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(GatewayOtp.this, "Invalid OTP entered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

                if ((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    Logger.getLogger("todo");
                }
    }



    public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}
