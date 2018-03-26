package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button setAlarmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setAlarmButton = findViewById(R.id.as_alarm_btn);
        setAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                //intent.setAction("com.example.firstproject.придуманное_действие");
                intent.setAction(AlarmClock.ACTION_SET_ALARM);


                intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Вставай")
                        .putExtra(AlarmClock.EXTRA_HOUR, 6)
                        .putExtra(AlarmClock.EXTRA_MINUTES, 0);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


        /*Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle!=null){
            String data = bundle.getCharSequence("someData").toString();
        }*/
    }
}
