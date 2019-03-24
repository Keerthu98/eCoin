package com.example.vicky.e_coin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.example.vicky.e_coin.retrofit.IMyservices;
import com.example.vicky.e_coin.retrofit.RetrofitClient;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class Signup extends AppCompatActivity {
    Button rtsignup;
    EditText usernamesp;
    EditText passwordsp;
    EditText passwordspcf;
    EditText name1;
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
        setContentView(R.layout.activity_signup);
        rtsignup = findViewById(R.id.signuprt);
        usernamesp =findViewById(R.id.mailsp);
        passwordsp =findViewById(R.id.passsp);
        passwordspcf =findViewById(R.id.passspcp);
        name1 =findViewById(R.id.namesp);
        Retrofit retrofitClient = RetrofitClient.getInstance();
        iMyservices = retrofitClient.create(IMyservices.class);

    }

    public void signup(View view){
        String usr = usernamesp.getText().toString();
        String name = name1.getText().toString();
        if(emailvalidate(usr,name)){
            if(passwordsp.getText().toString().matches(passwordspcf.getText().toString())) {
                String pass = passwordsp.getText().toString();
                registerUser(usr,name,pass);
            }
            else {Toast.makeText(Signup.this,"Password Mismatch",Toast.LENGTH_LONG).show();}
        }
        else
            Toast.makeText(getApplicationContext(),"Invalid mail/User",Toast.LENGTH_LONG).show();
    }

    private void registerUser(String usr, String name, String pass) {

        compositeDisposable.add(iMyservices.registerUser(usr,name,pass)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String response) throws Exception {
                        Toast.makeText(Signup.this, response, Toast.LENGTH_SHORT).show();
                    }
                }));
    }

    public static boolean emailvalidate(String usr, String name){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+(\\.[a-z]+)+";
        return (usr.matches(emailPattern)&& usr.length()>0 && name.length()>0);
    }


}
