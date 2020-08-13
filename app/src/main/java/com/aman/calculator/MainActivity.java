package com.aman.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    private Button buttonSum, buttonDifference, buttonProduct, buttonDivision, buttonResult, buttonZero, buttonClear;
    private TextView textViewResult, textViewInput;
    String operator;
    float result;
    Digit digit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.tvResult);
        buttonZero = findViewById(R.id.btnZero);
        buttonOne = findViewById(R.id.btnOne);
        buttonTwo = findViewById(R.id.btnTwo);
        buttonThree = findViewById(R.id.btnThree);
        buttonFour = findViewById(R.id.btnFour);
        buttonFive = findViewById(R.id.btnFive);
        buttonSix = findViewById(R.id.btnSix);
        buttonSeven = findViewById(R.id.btnSeven);
        buttonEight = findViewById(R.id.btnEight);
        buttonNine = findViewById(R.id.btnNine);
        buttonSum = findViewById(R.id.btnSum);
        buttonDifference = findViewById(R.id.btnDifference);
        buttonProduct = findViewById(R.id.btnProduct);
        buttonDivision = findViewById(R.id.btnDivision);
        buttonResult = findViewById(R.id.btnResult);
        buttonClear = findViewById(R.id.btnClear);
        textViewInput = findViewById(R.id.tvInput);


        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonSum.setOnClickListener(this);
        buttonDifference.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonProduct.setOnClickListener(this);
        buttonResult.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

        digit = new Digit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnZero:

                textViewInput.append(buttonZero.getText().toString().trim());
                break;
            case R.id.btnOne:

                textViewInput.append(buttonOne.getText().toString().trim());
                break;
            case R.id.btnTwo:

                textViewInput.append(buttonTwo.getText().toString().trim());
                break;
            case R.id.btnThree:

                textViewInput.append(buttonThree.getText().toString().trim());
                break;
            case R.id.btnFour:

                textViewInput.append(buttonFour.getText().toString().trim());
                break;
            case R.id.btnFive:

                textViewInput.append(buttonFive.getText().toString().trim());
                break;
            case R.id.btnSix:

                textViewInput.append(buttonSix.getText().toString().trim());
                break;
            case R.id.btnSeven:

                textViewInput.append(buttonSeven.getText().toString().trim());
                break;
            case R.id.btnEight:

                textViewInput.append(buttonEight.getText().toString().trim());
                break;
            case R.id.btnNine:


                textViewInput.append(buttonNine.getText().toString().trim());
                break;
            case R.id.btnSum:

                operator = buttonSum.getText().toString().trim();
                textViewInput.append(buttonSum.getText().toString().trim());
                break;
            case R.id.btnProduct:
                operator = buttonProduct.getText().toString().trim();
                textViewInput.append(buttonProduct.getText().toString().trim());
                break;
            case R.id.btnDifference:
                operator = buttonDifference.getText().toString().trim();
                textViewInput.append(buttonDifference.getText().toString().trim());
                break;
            case R.id.btnDivision:
                operator = buttonDivision.getText().toString().trim();
                textViewInput.append(buttonDivision.getText().toString().trim());
                break;
            case R.id.btnResult:
                printResult();
                break;
            case R.id.btnClear:
                textViewResult.setText("");
                textViewInput.setText("");
                break;
        }

    }

    private void printResult() {
        String operation = textViewInput.getText().toString().trim();
        Log.d(TAG, "printResult: " + operation);
        String[] inputs = operation.split("[-/+*]");
        /*for (String input:inputs){
            Log.d(TAG, "printResult: "+input);
        }*/
        String input1 = inputs[0];
        String input2 = inputs[1];
        float n1 = Float.parseFloat(input1);
        float n2 = Float.parseFloat(input2);
        Log.d(TAG, "printResult: n1->" + n1 + " n2->" + n2);
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        textViewResult.setText(String.valueOf(result));
    }
}