package com.nadia.mobileappdevelop.calculatorexperimentnadia;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity{
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    EditText etFirstNumber, etSecondNumber, etThirdNumber;
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnEqual, btnClear;
    String str="";
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);

        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClear = (Button) findViewById(R.id.btnClear);

        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void one(View view){
        str = str + "1";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void two(View view){
        str = str + "2";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void three(View view){
        str = str + "3";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void four(View view){
        str = str + "4";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void five(View view){
        str = str + "5";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void six(View view){
        str = str + "6";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void seven(View view){
        str = str + "7";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void eight(View view){
        str = str + "8";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void nine(View view){
        str = str + "9";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void zero(View view){
        str = str + "0";
        str = checkZero(str);
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void plus(View view){
        str = str + "+";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void minus(View view){
        str = str + "-";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void multiply(View view){
        str = str + "*";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void divide(View view){
        str = str + "/";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void equal(View view){

        int index;
        Double number1, number2, res;
        Boolean plus = (str.contains("+")) ? true : false;
        Boolean minus = (str.contains("-")) ? true : false;
        Boolean multiply = (str.contains("*")) ? true : false;
        Boolean divide = (str.contains("/")) ? true : false;

        etFirstNumber.getText().clear();
       // str = "";
        if (plus){
            index = str.indexOf("+");
            number1 = Double.valueOf(str.substring(0, index));
            number2 = Double.valueOf(str.substring(index+1, str.length()));
            res = number1+number2;
            tvResult.setText(number1 + "+" + number2 + "=" + res.toString());
            Toast.makeText(getApplicationContext(), "Index: " + index + "\nnumber1: " + number1
                    + "\nnumber2: " + number2
                    + "\nsum: " + res, Toast.LENGTH_LONG).show();
        }
        else if (minus){
            index = str.indexOf("-");
            number1 = Double.valueOf(str.substring(0, index));
            number2 = Double.valueOf(str.substring(index + 1, str.length()));
            res = number1-number2;
            tvResult.setText(number1 + "-" + number2 + "=" + res.toString());
            Toast.makeText(getApplicationContext(), "Index: " + index + "\nnumber1: " + number1
                    + "\nnumber2: " + number2
                    + "\nsum: " + res, Toast.LENGTH_LONG).show();
        }
        else if (multiply){
            index = str.indexOf("*");
            number1 = Double.valueOf(str.substring(0, index));
            number2 = Double.valueOf(str.substring(index+1, str.length()));
            res = number1*number2;
            tvResult.setText(number1 + "*" + number2 + "=" + res.toString());
            Toast.makeText(getApplicationContext(), "Index: " + index + "\nnumber1: " + number1
                    + "\nnumber2: " + number2
                    + "\nsum: " + res, Toast.LENGTH_LONG).show();
        }
        else if (divide){
            index = str.indexOf("/");
            number1 = Double.valueOf(str.substring(0, index));
            number2 = Double.valueOf(str.substring(index+1, str.length()));
            res = number1/number2;
            tvResult.setText(number1 + "/" + number2 + "=" + res.toString());
            String msg = "Index: " + index + "\nnumber1: " + number1
                    + "\nnumber2: " + number2
                    + "\nsum: " + res;
            showMessage(msg);
        }

        str = "";
    }
    public void point(View v){
        str = str + ".";
        etFirstNumber.getText().clear();
        etFirstNumber.setText(str);
    }
    public void clear(View v){
        str = "";
        etFirstNumber.getText().clear();
    }

    public void signConvert(View v){
        if (String.valueOf(str.charAt(0)) == "-"){
            showMessage("Its minus");
            str = "" + str.substring(1, str.length());
            showMessage(str);
            showMessage(String.valueOf(str.charAt(0)));
        }
        else if (String.valueOf(str.charAt(0)) != "-"){
            showMessage("Its not minus");
            str = "-" + str.substring(0, str.length());
            showMessage(str);
        }
    }
    public void delete(View v){
        //showMessage(str);
        str = removeLastCharacter(str);
        //showMessage(str);
        etFirstNumber.setText(str);

    }
    private String removeLastCharacter(String string){
        if (string.length()>0){
            string = string.substring(0, string.length()-1);
        }
        return string;
    }
    private String checkZero(String string){
        if (string.length()>1){
            if (String.valueOf(string.charAt(0)).equals("0") &&
                    !String.valueOf(string.charAt(1)).equals(".")){
                string = string.substring(1, string.length());
            }
            else if (String.valueOf(string.charAt(0)).equals("0") &&
                    String.valueOf(string.charAt(1)).equals("0")){
                string = string.substring(1, string.length());
            }
        }

        return string;
    }
    private void showMessage(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
