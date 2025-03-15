package io.example.shapesolverapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Prism extends AppCompatActivity {

    EditText prism_area, prism_height;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prism_area = findViewById(R.id.editText_prism_area);
        prism_height = findViewById(R.id.editText_prism_height);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String baseStr = prism_area.getText().toString().trim();
                String heightStr = prism_height.getText().toString().trim();

                if (baseStr.isEmpty() || heightStr.isEmpty()) {
                    result.setText("⚠️ Please enter valid numbers!");
                    return;
                }

                try {
                    double B = Double.parseDouble(baseStr); // Base Area (or Base Length if triangular)
                    double h = Double.parseDouble(heightStr); // Height

                    // For rectangular prism
                    double volume = B * h;

                    // If it's a triangular prism, uncomment the line below
                    // volume = 0.5 * B * h;

                    result.setText("V = " + volume + " m³");
                } catch (NumberFormatException e) {
                    result.setText("⚠️ Invalid input! Enter numbers only.");
                }
            }
        });

    }

}