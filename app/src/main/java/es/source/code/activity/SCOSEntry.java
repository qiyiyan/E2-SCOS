package es.source.code.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SCOSEntry extends AppCompatActivity {

    float x1 = 0;
    float x2 = 0;
    float y1 = 0;
    float y2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);




    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            //当手指按下时
            x1=event.getX();
            y1=event.getY();
        }
        if(event.getAction()==MotionEvent.ACTION_UP){
            //当手指离开时
            x2=event.getX();
            y2=event.getY();
            //手势判断
            if((x1 - x2) > 50){
                Log.i("SCOSEntry","LEFT");
                String data="FromEntry";
                Intent intent= new Intent(SCOSEntry.this,MainScreen.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
            }
        }
        return super.onTouchEvent(event);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
