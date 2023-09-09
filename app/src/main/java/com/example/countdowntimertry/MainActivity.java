package com.example.countdowntimertry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView1, textView2;
    private int timeRemaining = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //here i try

        getSupportActionBar().hide();

        textView1 = findViewById(R.id.text_view_id1);
        textView2 = findViewById(R.id.text_view_id2);

        startTimer();




        private void startTimer()
        {

            new CountDownTimer(6000, 1000)
            {

                @Override
                public void onTick(long l)
                {
                    textView2.setText(""+l/1000);
                }

                @Override
                public void onFinish()
                {
                    if(timeRemaining == 0)
                    {
                        timeRemaining = 10;
                    }
                    startTimer();
                    timeRemaining = timeRemaining - 1;
                    textView1.setText(""+timeRemaining);
                }
            }.start();

        }
    }
}