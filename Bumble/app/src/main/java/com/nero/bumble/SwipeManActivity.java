package com.nero.bumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SwipeManActivity extends AppCompatActivity {
    private ImageButton iBtnFilterMen;
    private ImageButton iBtnUserMen;
    private ImageButton iBtnHeartMen;
    private ImageButton iBtnChatMen;
    private ImageButton SameActivityButton;
    private ImageButton iBtnStarButtonForSwipeMenP1;
    private ImageButton iBtnTickForSwipeMenP1;
    private ImageButton iBtnStarButtonForSwipeMenP2;
    private ImageButton iBtnTickForSwipeMenP2;
    private ImageButton iBtnStarButtonForSwipeMenP3;
    private ImageButton iBtnTickForSwipeMenP3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_man);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnFilterMen = findViewById(R.id.iBtnFilterMen);
        iBtnUserMen = findViewById(R.id.iBtnUserMen);
        iBtnHeartMen = findViewById(R.id.iBtnHeartMen);
        iBtnChatMen = findViewById(R.id.iBtnChatMen);
        SameActivityButton = findViewById(R.id.SameActivityButton);
        iBtnStarButtonForSwipeMenP1 = findViewById(R.id.iBtnStarButtonForSwipeMenP1);
        iBtnTickForSwipeMenP1 = findViewById(R.id.iBtnTickForSwipeMenP1);
        iBtnStarButtonForSwipeMenP2 = findViewById(R.id.iBtnStarButtonForSwipeMenP2);
        iBtnTickForSwipeMenP2 = findViewById(R.id.iBtnTickForSwipeMenP2);
        iBtnStarButtonForSwipeMenP3 = findViewById(R.id.iBtnStarButtonForSwipeMenP3);
        iBtnTickForSwipeMenP3 = findViewById(R.id.iBtnTickForSwipeMenP3);


        //for filter button

        iBtnFilterMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, FilterActivity.class);
                startActivity(intent);
            }
        });

        // Profile visit

        iBtnUserMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, ProfileWomanActivity.class);
                startActivity(intent);
            }
        });

        //Heart Button

        iBtnHeartMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, BeelineActivity.class);
                intent.putExtra("gender","men");
                startActivity(intent);
            }
        });
        //chat button
        iBtnChatMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,ChatActivity.class);
                intent.putExtra("whichone","man");
                startActivity(intent);
            }
        });
        //same activity button
        SameActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        //star button for swipe man activity
        iBtnStarButtonForSwipeMenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });

        //tick button for swipe men
        iBtnTickForSwipeMenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
        //star button for swipe men
        iBtnStarButtonForSwipeMenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });

        //for tick button

        iBtnTickForSwipeMenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
        //for star button`

        iBtnStarButtonForSwipeMenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });

        // for tick button

        iBtnTickForSwipeMenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });

    }
}