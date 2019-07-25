package com.example.less_310;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text_view);
        textView.setText("Hello, World!!!");

        Button button = findViewById(R.id.button);
        button.setTag(1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textView.setText("Button clicked");
                final int tekst = (Integer) view.getTag();
                if (tekst == 1) {
                    textView.setText("Button clicked");
                    view.setTag(0);
                } else {
                        textView.setText("Bye bye");
                    view.setTag(1);
                }
            }

        });

    }
}
