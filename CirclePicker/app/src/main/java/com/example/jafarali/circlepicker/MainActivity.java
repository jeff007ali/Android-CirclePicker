package com.example.jafarali.circlepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    AbsoluteLayout rl;
    Button rb1,rb2,rb3,rb4,rb5;
    Random r;
    static int counter = 0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (AbsoluteLayout) findViewById(R.id.rl);
        rb1 = (Button) findViewById(R.id.button1);
        rb2 = (Button) findViewById(R.id.button2);
        rb3 = (Button) findViewById(R.id.button3);
        rb4 = (Button) findViewById(R.id.button4);
        rb5 = (Button) findViewById(R.id.button5);
        tv = (TextView) findViewById(R.id.textView);

       r = new Random();

        final Handler h = new Handler();
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                findViews();
            }
        };

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                h.post(r);
            }
        },1000,3000);


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                tv.setText("Score: "+counter);
            }
        });




        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setVisibility(View.GONE);
                counter++;
                tv.setText("Score: "+counter);
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setVisibility(View.GONE);
                counter++;
                tv.setText("Score: "+counter);
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb3.setVisibility(View.GONE);
                counter++;
                tv.setText("Score: "+counter);
            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb4.setVisibility(View.GONE);
                counter++;
                tv.setText("Score: "+counter);
            }
        });

        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb5.setVisibility(View.GONE);
                counter++;
                tv.setText("Score: "+counter);
            }
        });
    }

    private void findViews() {
        rb1.setVisibility(View.VISIBLE);
        rb2.setVisibility(View.VISIBLE);
        rb3.setVisibility(View.VISIBLE);
        rb4.setVisibility(View.VISIBLE);
        rb5.setVisibility(View.VISIBLE);

        AbsoluteLayout.LayoutParams absParams1 =
                (AbsoluteLayout.LayoutParams)rb1.getLayoutParams();

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels - 350;
        int height = displaymetrics.heightPixels - 350;

        absParams1.x =  r.nextInt(width ) ;
        absParams1.y =  r.nextInt(height );
        rb1.setLayoutParams(absParams1);

        AbsoluteLayout.LayoutParams absParams2 =
                (AbsoluteLayout.LayoutParams)rb2.getLayoutParams();

        absParams2.x =  r.nextInt(width ) ;
        absParams2.y =  r.nextInt(height );
        rb2.setLayoutParams(absParams2);

        AbsoluteLayout.LayoutParams absParams3 =
                (AbsoluteLayout.LayoutParams)rb3.getLayoutParams();

        absParams3.x =  r.nextInt(width ) ;
        absParams3.y =  r.nextInt(height );
        rb3.setLayoutParams(absParams3);

        AbsoluteLayout.LayoutParams absParams4 =
                (AbsoluteLayout.LayoutParams)rb4.getLayoutParams();

        absParams4.x =  r.nextInt(width ) ;
        absParams4.y =  r.nextInt(height );
        rb4.setLayoutParams(absParams4);

        AbsoluteLayout.LayoutParams absParams5 =
                (AbsoluteLayout.LayoutParams)rb5.getLayoutParams();

        absParams5.x =  r.nextInt(width ) ;
        absParams5.y =  r.nextInt(height );
        rb5.setLayoutParams(absParams5);

    }
}
