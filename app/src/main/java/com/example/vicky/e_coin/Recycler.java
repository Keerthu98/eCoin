package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {



    private int[] myImageList = new int[]{R.drawable.money_trans, R.drawable.maintain_trans,R.drawable.utility_trans, R.drawable.girl};
    private String[] myImageNameList = new String[]{"Money Transfer","Wallet Maintenance" ,"Payment Utilities","Ticket Booking"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        ArrayList<Models> imageModelArrayList;
        ModelAdapter adapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Toast.makeText(this, "Swipe", Toast.LENGTH_SHORT).show();
        recyclerView =findViewById(R.id.recycler);
        imageModelArrayList = initialize();
        adapter = new ModelAdapter(this, imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplication(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                       if(position==0){
                           Intent moneytransint = new Intent(view.getContext(),Fragmentholder.class);
                           startActivity(moneytransint);
                        }
                        if(position==1){
                            Intent maintainint = new Intent(view.getContext(),Maintain.class);
                            startActivity(maintainint);
                        }
                        if(position==2){
                            Intent utility =  new Intent(view.getContext(),PaymentUtility.class);
                            startActivity(utility);
                        }
                        if(position==3){
                            Intent ticketint = new Intent(view.getContext(),Ticket.class);
                            startActivity(ticketint);
                        }
                    }
                    @Override
                    public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }

    private ArrayList<Models> initialize(){

        ArrayList<Models> list = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            Models fruitModel = new Models();
            fruitModel.setName(myImageNameList[i]);
            fruitModel.setImagedrawable(myImageList[i]);
            list.add(fruitModel);
        }
        return list;
    }
}
