package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText display;
    boolean add, sub, mul,divide;
    double result1, result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.inputTxt).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });
    }
    private void updateText(String Value){
//        getting previous value of input field
        String prev = display.getText().toString();
        int curPos = display.getSelectionStart();
        String leftStr = prev.substring(0,curPos);
        String rightStr = prev.substring(curPos);
        if(getString(R.string.inputTxt).equals(display.getText().toString())){
            display.setText(Value);
            display.setSelection(curPos+1);
        }
        else{
            display.setText(String.format("%s%s%s",leftStr,Value,rightStr));
            display.setSelection(curPos+1);
        }

    }

    public void zeroBtn(View view){
        updateText("0");
    }
    public void oneBtn(View view){
        updateText("1");
    }
    public void twoBtn(View view){
        updateText("2");
    }
    public void threeBtn(View view){
        updateText("3");
    }
    public void fourBtn(View view){
        updateText("4");
    }
    public void fiveBtn(View view){
        updateText("5");
    }
    public void sixBtn(View view){
        updateText("6");
    }
    public void sevenBtn(View view){
        updateText("7");
    }
    public void eightBtn(View view){
        updateText("8");
    }
    public void nineBtn(View view){
        updateText("9");
    }

//    Operational Buttons
    public void addBtn(View view){
//        updateText("+");
        result1 = Double.parseDouble(display.getText()+"");
        add = true;
        display.setText(null);
    }
    public void subBtn(View view){
//        updateText("-");
        result1 = Double.parseDouble(display.getText()+"");
        sub = true;
        display.setText(null);
    }
    public void divBtn(View view){
//        updateText("/");
        result1 = Double.parseDouble(display.getText()+"");
        divide = true;
        display.setText(null);
    }
    public void mulBtn(View view){
//        updateText("x");
        result1 = Double.parseDouble(display.getText()+"");
        mul = true;
        display.setText(null);
    }
//    Result btn
    public void resBtn(View view){
        result2 = Double.parseDouble(display.getText()+"");
        if(add==true){
            display.setText(result1+result2+"");
            add = false;
        }
        if(sub==true){
            display.setText(result1-result2+"");
            sub= false;
        }
        if(mul==true){
            display.setText(result1*result2+"");
            mul = false;
        }
        if(add==true){
            display.setText(result1/result2+"");
            add = false;
        }

    }

//    clear value btn
    public void clearBtn(View view){
        display.setText("");
    }



}