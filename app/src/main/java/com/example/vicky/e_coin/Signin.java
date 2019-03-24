package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vicky.e_coin.retrofit.IMyservices;
import com.example.vicky.e_coin.retrofit.RetrofitClient;
import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

public class Signin extends AppCompatActivity {
    Button insign;
    Button signup;
    EditText mail;
    EditText pass;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    IMyservices iMyservices;

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        insign =findViewById(R.id.Signin);
        signup =findViewById(R.id.signup);
        mail =findViewById(R.id.mail);
        pass =findViewById(R.id.pass);

        Retrofit retrofitClient = RetrofitClient.getInstance();
        iMyservices = retrofitClient.create(IMyservices.class);

    }

    public void signup(View view){
        Intent sgint = new Intent(getApplicationContext(),Signup.class);
        startActivity(sgint);
    }
    public void authenticate(View view){

        String uname = mail.getText().toString();
        String passch = pass.getText().toString();
        //major auth
        //temp login
        if(temporary(uname,passch)){
            Intent adminint = new Intent(getApplicationContext(), Recycler.class);
            startActivity(adminint);
        }
        else{
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
        }

    }
    public static boolean temporary(String uname, String passch){
        return (uname.equals("vicky@admin.com")&&passch.equals("admin"));
    }
}
