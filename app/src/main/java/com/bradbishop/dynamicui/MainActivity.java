package com.bradbishop.dynamicui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentLabelIndex = 1;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.addNewLabel);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = new TextView(context);
                textView.setText("Label " + currentLabelIndex);

                LinearLayout ll = findViewById(R.id.linearLayout);
                ll.addView(textView);

                currentLabelIndex++;

            }
        });
    }
}
