package com.example.edittextintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    double num1, num2;
    int mathkind = -1;
    String sed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.edd);

    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public double math(int n, double num1, double num2){
        if (n == 1){
            return num1+num2;
        }
        else{
            if (n == 2) {
                return num1 - num2;
            }
            else{
                if (n == 3){
                    return num1*num2;
                }
                else{
                    return num1/num2;
                }
            }
        }
    }

    public void add(View view) {
        if (mathkind != -1) {
            if (mathkind == 5) {
                ed.setHint(num1 + " + ");
                ed.setText("");
                Toast.makeText(this, "last oper was =, new oper is +, enter number now", Toast.LENGTH_LONG).show();
            }
            else {
                sed = ed.getText().toString();
                if (isNumeric(sed)) {
                    num2 = Double.parseDouble(sed);
                    num1 = math(mathkind, num1, num2);
                    ed.setHint(num1 + " + ");
                    ed.setText("");
                }
                else {
                    Toast.makeText(this,"WRONG INPUT! please enter a new number. the oper is now +", Toast.LENGTH_LONG).show();
                    ed.setHint(num1 + " + ");
                    ed.setText("");
                }
            }
        }
        else {
            sed = ed.getText().toString();
            if (isNumeric(sed)){
                num2 = Double.parseDouble(sed);
                ed.setHint(num2 + " + ");
                ed.setText("");
                num1 = num2;
            }
            else {
                Toast.makeText(this, "WRONG INPUT! please enter a new number. the oper is now +", Toast.LENGTH_LONG).show();
                ed.setHint(num1 + " + ");
                ed.setText("");
            }
        }
        mathkind = 1;
    }

    public void sub(View view) {
        if (mathkind != -1) {
            if (mathkind == 5) {
                ed.setHint(num1 + " - ");
                ed.setText("");
                Toast.makeText(this, "last oper was =, new oper is -, enter number now", Toast.LENGTH_LONG).show();
            }
            else {
                sed = ed.getText().toString();
                if (isNumeric(sed)) {
                    num2 = Double.parseDouble(sed);
                    num1 = math(mathkind, num1, num2);
                    ed.setHint(num1 + " - ");
                    ed.setText("");
                }
                else {
                    Toast.makeText(this,"WRONG INPUT! please enter a new number. the oper is now -", Toast.LENGTH_LONG).show();
                    ed.setHint(num1 + " - ");
                    ed.setText("");
                }
            }
        }
        else {
            sed = ed.getText().toString();
            if (isNumeric(sed)){
                num2 = Double.parseDouble(sed);
                ed.setHint(num2 + " - ");
                ed.setText("");
                num1 = num2;
            }
            else {
                Toast.makeText(this, "WRONG INPUT! please enter a new number. the oper is now -", Toast.LENGTH_LONG).show();
                ed.setHint(num1 + " - ");
                ed.setText("");
            }
        }
        mathkind = 2;
    }

    public void multi(View view) {
        if (mathkind != -1) {
            if (mathkind == 5) {
                ed.setHint(num1 + " * ");
                ed.setText("");
                Toast.makeText(this, "last oper was =, new oper is *, enter number now", Toast.LENGTH_LONG).show();
            }
            else {
                sed = ed.getText().toString();
                if (isNumeric(sed)) {
                    num2 = Double.parseDouble(sed);
                    num1 = math(mathkind, num1, num2);
                    ed.setHint(num1 + " * ");
                    ed.setText("");
                }
                else {
                    Toast.makeText(this,"WRONG INPUT! please enter a new number. the oper is now *", Toast.LENGTH_LONG).show();
                    ed.setHint(num1 + " * ");
                    ed.setText("");
                }
            }
        }
        else {
            sed = ed.getText().toString();
            if (isNumeric(sed)){
                num2 = Double.parseDouble(sed);
                ed.setHint(num2 + " * ");
                ed.setText("");
                num1 = num2;
            }
            else {
                Toast.makeText(this, "WRONG INPUT! please enter a new number. the oper is now *", Toast.LENGTH_LONG).show();
                ed.setHint(num1 + " * ");
                ed.setText("");
            }
        }
        mathkind = 3;
    }

    public void div(View view) {
        if (mathkind != -1) {
            if (mathkind == 5) {
                ed.setHint(num1 + " / ");
                ed.setText("");
                Toast.makeText(this, "last oper was =, new oper is /, enter number now", Toast.LENGTH_LONG).show();
            }
            else {
                sed = ed.getText().toString();
                if (isNumeric(sed)) {
                    num2 = Double.parseDouble(sed);
                    num1 = math(mathkind, num1, num2);
                    ed.setHint(num1 + " / ");
                    ed.setText("");
                }
                else {
                    Toast.makeText(this,"WRONG INPUT! please enter a new number. the oper is now /", Toast.LENGTH_LONG).show();
                    ed.setHint(num1 + " / ");
                    ed.setText("");
                }
            }
        }
        else {
            sed = ed.getText().toString();
            if (isNumeric(sed)){
                num2 = Double.parseDouble(sed);
                ed.setHint(num2 + " / ");
                ed.setText("");
                num1 = num2;
            }
            else {
                Toast.makeText(this, "WRONG INPUT! please enter a new number. the oper is now /", Toast.LENGTH_LONG).show();
                ed.setHint(num1 + " / ");
                ed.setText("");
            }
        }
        mathkind = 4;
    }

    public void result(View view) {
        sed = ed.getText().toString();
        if (isNumeric(sed)) {
            num2 = Double.parseDouble(sed);
            ed.setHint(num1 + "");
            ed.setText("");
        } else {
            Toast.makeText(this, "WRONG INPUT! please enter a new number. the oper is now =", Toast.LENGTH_LONG).show();
            ed.setHint("" + num1);
            ed.setText("");
        }
        if (mathkind != -1) {
            num1 = math(mathkind, num1, num2);
            ed.setHint("" + num1);
            ed.setText("");
            mathkind = 5;
        }
        else {
            if (mathkind == 5) {
                Toast.makeText(this, "please enter a number and an operator", Toast.LENGTH_LONG).show();
                ed.setText("");
                ed.setHint("" + num1);
            }
            else {
                Toast.makeText(this, "please enter a number and an operator", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void AC(View view) {
        mathkind = -1;
        ed.setHint("");
        ed.setText("");
        num1 = 0;
        num2 = 0;
    }

    public void Credits(View view) {
        Intent si = new Intent(this,creditsActivity.class);
        si.putExtra("n",num1);
        startActivity(si);
    }

}
