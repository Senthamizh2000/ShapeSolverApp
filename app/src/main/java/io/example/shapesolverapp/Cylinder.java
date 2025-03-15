package io.example.shapesolverapp;

import static io.example.shapesolverapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Cylinder extends AppCompatActivity {

    EditText cylinder_radius, cylinder_height;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_cylinder);

        cylinder_radius = findViewById(R.id.editText_cylinder_radius);
        cylinder_height = findViewById(R.id.editText_cylinder_height);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int r = Integer.parseInt(cylinder_radius.getText().toString());
                int h = Integer.parseInt(cylinder_height.getText().toString());


                // V = (4/3) * pi * r^3

                double volume = Math.PI * r * r * h;

                result.setText("V = " + volume + " m³");
            }
        });
    }

}