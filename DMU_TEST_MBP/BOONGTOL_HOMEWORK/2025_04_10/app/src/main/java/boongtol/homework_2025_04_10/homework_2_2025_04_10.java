package boongtol.homework_2025_04_10;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class homework_2_2025_04_10 extends AppCompatActivity {

    private TextView txtResult;
    private String current = "0";
    private String operator = "";
    private double firstValue = 0;
    private boolean isNewInput = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_2_2025_04_10);
        txtResult = findViewById(R.id.txtResult);
    }

    public void numberClick(View view) {
        Button btn = (Button) view;
        String num = btn.getText().toString();

        if (isNewInput || current.equals("0")) {
            current = num;
            isNewInput = false;
        } else {
            current += num;
        }
        txtResult.setText(current);
    }

    public void operatorClick(View view) {
        Button btn = (Button) view;
        operator = btn.getText().toString();
        firstValue = Double.parseDouble(current);
        isNewInput = true;
    }

    public void calculate(View view) {
        double secondValue = Double.parseDouble(current);
        double result = 0;

        switch (operator) {
            case "+": result = firstValue + secondValue; break;
            case "−": result = firstValue - secondValue; break;
            case "×": result = firstValue * secondValue; break;
            case "÷":
                if (secondValue == 0) {
                    txtResult.setText("오류");
                    return;
                }
                result = firstValue / secondValue;
                break;
        }

        current = String.valueOf(result);
        txtResult.setText(current);
        isNewInput = true;
    }

    public void clear(View view) {
        current = "0";
        operator = "";
        firstValue = 0;
        isNewInput = true;
        txtResult.setText("0");
    }

    public void toggleSign(View view) {
        if (current.equals("0")) return;
        if (current.startsWith("-")) current = current.substring(1);
        else current = "-" + current;
        txtResult.setText(current);
    }

    public void percent(View view) {
        double val = Double.parseDouble(current);
        val = val / 100;
        current = String.valueOf(val);
        txtResult.setText(current);
    }
}
