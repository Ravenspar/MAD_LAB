package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {  TextView txtCounter;
    Button btn_start,btn_stop;
    int count=0;
    Handler customHandler= new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCounter = (TextView) findViewById(R.id.textview2);  btn_start = (Button) findViewById(R.id.start_btn);  btn_stop = (Button) findViewById(R.id.stop_btn);  btn_start.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                customHandler.postDelayed(updateTimerThread, 0);  }
        });
        btn_stop.setOnClickListener(new View.OnClickListener() {  @Override
        public void onClick(View v) {

            customHandler.removeCallbacks(updateTimerThread);  }
        });
    }
    private final Runnable updateTimerThread =new Runnable() {  @Override
    public void run() {
        txtCounter.setText(""+count);
        customHandler.postDelayed(this,1000);  count++;
    }
    };
}
