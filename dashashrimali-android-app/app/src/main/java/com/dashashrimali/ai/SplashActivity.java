package com.dashashrimali.ai;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
