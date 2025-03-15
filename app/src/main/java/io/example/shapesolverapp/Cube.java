package io.example.shapesolverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Cube extends AppCompatActivity {

    EditText cube_radius;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cube_radius = findViewById(R.id.editText_cube);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cube_radius.getText().toString();

                int a = Integer.parseInt(radius);

                // V = (4/3) * pi * r^3

                double volume = a * a * a;

                result.setText("V = "+volume+" m³");
            }
        });
    }

}