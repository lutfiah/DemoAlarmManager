package com.myrp.a16023022.demoalarmmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AlarmReceiverActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);

        tv = (TextView)findViewById(R.id.textView2);
        Intent i = getIntent();
    }
}
