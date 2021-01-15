package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class B extends AppCompatActivity {

    private static final String TAG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("A");
        Log.d(TAG,"oncreate B");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(B.TAG,"onResume B");
    }



    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.buttonA:
                startActivity(new Intent(this,A.class));
                break;

            case R.id.buttonB:
                startActivity(new Intent(this,B.class));
                break;

            case R.id.buttonC:
                startActivity(new Intent(this,C.class));
                break;
        }
    }
}
