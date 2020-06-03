package br.com.calculaimc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressedButton(View view) {
        TextView result = findViewById(R.id.text_view_result_id);
        EditText heightInput = findViewById(R.id.edit_text_height_id);
        EditText weightInput = findViewById(R.id.edit_text_weight_id);

        float height = Float.parseFloat(heightInput.getText().toString());
        float weight = Float.parseFloat(weightInput.getText().toString());
        float bmi = weight / (height * height) * 10000;

        checkBmiCategories(result, bmi);


    }

    private void checkBmiCategories(TextView result, float bmi) {
        if (bmi <= 18.5) {
            result.setText("you are underweight");
        }
        if (bmi > 18.5 && bmi <= 24.9) {
            result.setText("you under normal weight");
        }
        if (bmi > 25 && bmi <= 29.9) {
            result.setText("you are overweight");
        }
        if (bmi > 29.9) {
            result.setText("you are obesity");
        }
    }


}
