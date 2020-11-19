package com.example.tesk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tesk.ui.personal.PersonalFragment;

public class PersonalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_personal);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PersonalFragment.newInstance())
                    .commitNow();
        }
    }
}