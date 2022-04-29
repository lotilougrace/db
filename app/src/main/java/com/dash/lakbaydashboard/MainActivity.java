package com.dash.lakbaydashboard;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cardProf, cardSettings, cardEwallet, cardTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardProf = findViewById(R.id.cardProf);
        cardSettings = findViewById(R.id.cardSettings);
        cardEwallet = findViewById(R.id.cardEwallet);
        cardTransaction = findViewById(R.id.cardTransaction);


        cardProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Profile");

            }
        });

        cardSettings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                showToast("Settings");

            }
        });
        cardEwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("E-Wallet");
            }
        });
        cardTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Transaction History");
            }
        });
        cardProf.setOnClickListener(this);
        cardSettings.setOnClickListener(this);
        cardEwallet.setOnClickListener(this);
        cardTransaction.setOnClickListener(this);

    }
    private void showToast(String message){
        Toast.makeText(this, message


                , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.cardProf:

                i= new Intent(this,Profile.class);
                startActivity(i);
                break;
            case R.id.cardEwallet:

                i= new Intent(this,EWallet.class);
                startActivity(i);
                break;
            case R.id.cardTransaction:

                i= new Intent(this,TransactionHistory.class);
                startActivity(i);
                break;
            case R.id.cardSettings:

                i= new Intent(this,Settings.class);
                startActivity(i);
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Change email selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Change password selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.aboutUs:
                Intent myIntent = new Intent(MainActivity.this,
                        AboutUs.class);
                startActivity(myIntent);
                Toast.makeText(this, "About us selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.logout:
                Toast.makeText(this, "Log-out", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}