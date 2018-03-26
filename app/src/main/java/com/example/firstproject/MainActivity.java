package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String componentName = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.ma_next_btn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putCharSequence("sameDate", "PoPkA");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        //Log.d("Имя Компонента", "Сообщение");
        Log.d(componentName, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(componentName, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(componentName, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(componentName, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(componentName, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(componentName, "onDestroy");
    }
}
