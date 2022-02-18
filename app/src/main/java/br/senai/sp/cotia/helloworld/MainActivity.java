package br.senai.sp.cotia.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w( "IUPIIIIII","Passou no Oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "IUPIIIIII","Passou no Oncreate");
    }
}