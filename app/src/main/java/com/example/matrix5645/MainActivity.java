package com.example.matrix5645;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("El Botcito Manco");
        getSupportActionBar().setIcon(getDrawable(R.drawable.botz1));


        TextView textView =findViewById(R.id.text_view);

        TextView tv=  findViewById(R.id.text_view);

        Animation td =
                AnimationUtils.loadAnimation(this,R .anim.aparicion);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        tv.startAnimation(td);

        TextView textView2 =findViewById(R.id.text_view2);
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setSelected(true);
    }




}
