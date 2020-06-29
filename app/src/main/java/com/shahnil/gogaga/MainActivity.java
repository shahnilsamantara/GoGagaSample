package com.shahnil.gogaga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import me.bendik.simplerangeview.SimpleRangeView;

public class MainActivity extends AppCompatActivity {


    private ImageView imageViewSeek;


    private SimpleRangeView seekBar;

    private Toolbar toolbar;


    private TextView textView;

    private Animation imageBounce;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewSeek = findViewById(R.id.seekimage);
        textView = findViewById(R.id.agetext);
        seekBar = findViewById(R.id.seekbar);
        toolbar = findViewById(R.id.toolbar);


        imageBounce = AnimationUtils.loadAnimation(this, R.anim.image_bounce);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Preferences");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);









        seekBar.setOnChangeRangeListener(new SimpleRangeView.OnChangeRangeListener() {
            @Override
            public void onRangeChanged(@NotNull SimpleRangeView simpleRangeView, int i, int i1) {
                i = i+18 ;
                i1 = i1+18;
                textView.setText(String.valueOf(i)+ "-" + String.valueOf(i1));

                if(i >= 18 && i <= 30   ||   i1 >= 18 && i1 <= 30){
                imageViewSeek.setImageResource(R.drawable.beer);

                //animation
                imageViewSeek.startAnimation(imageBounce);
                }
                if(i > 30 && i <= 40   ||  i1 > 30 && i1 <= 40){
                    imageViewSeek.setImageResource(R.drawable.wine);

                    //animation
                    imageViewSeek.startAnimation(imageBounce);
                }

                if(i > 40 && i <= 50   ||   i1 > 40 && i1 <= 50){
                    imageViewSeek.setImageResource(R.drawable.martini);

                    //animation
                    imageViewSeek.startAnimation(imageBounce);
                }


                if(i > 50 && i <= 60   ||  i1 > 50 && i1 <= 60){
                    imageViewSeek.setImageResource(R.drawable.gin);

                    //animation
                    imageViewSeek.startAnimation(imageBounce);
                }


                if(i > 60  && i <= 70   ||  i1 > 60 && i1 <= 70){
                    imageViewSeek.setImageResource(R.drawable.whiskey);

                    //animation
                    imageViewSeek.startAnimation(imageBounce);
                }


            }
        });


        seekBar.setOnTrackRangeListener(new SimpleRangeView.OnTrackRangeListener() {
            @Override
            public void onStartRangeChanged(@NotNull SimpleRangeView simpleRangeView, int i) {
                i = i+18 ;
                textView.setText(String.valueOf(i));
            }

            @Override
            public void onEndRangeChanged(@NotNull SimpleRangeView simpleRangeView, int i) {

                i = i+18 ;
                textView.setText(String.valueOf(i));
            }
        });

        seekBar.setOnRangeLabelsListener(new SimpleRangeView.OnRangeLabelsListener() {
            @Nullable
            @Override
            public String getLabelTextForPosition(@NotNull SimpleRangeView simpleRangeView, int i, @NotNull SimpleRangeView.State state) {
                i = i+18 ;
                return String.valueOf(i);
            }
        });






    }







}