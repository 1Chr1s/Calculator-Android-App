package com.nerdyrocks.calculator;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Class Variables:
    private calculations calc;
    private final int _Max = 14;
    private Button[] button = new Button[_Max];
    private TextView textView;
    private int first_Num;
    private int second_Num;
    private int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating the calc object:
        calc = new calculations();
        // Creating the buttons:
        for (int i = 0; i < _Max; i++) {
            switch (i) {
                case 0:
                    // Creating the text field
                    textView = (TextView) findViewById(R.id.screen);
                    button[i] = (Button) findViewById(R.id.first_button);
                    break;
                case 1:
                    button[i] = (Button) findViewById(R.id.second_button);
                    break;
                case 2:
                    button[i] = (Button) findViewById(R.id.third_button);
                    break;
                case 3:
                    button[i] = (Button) findViewById(R.id.fourth_button);
                    break;
                case 4:
                    button[i] = (Button) findViewById(R.id.fifth_button);
                    break;
                case 5:
                    button[i] = (Button) findViewById(R.id.sixth_button);
                    break;
                case 6:
                    button[i] = (Button) findViewById(R.id.seventh_button);
                    break;
                case 7:
                    button[i] = (Button) findViewById(R.id.eighth_button);
                    break;
                case 8:
                    button[i] = (Button) findViewById(R.id.nineth_button);
                    break;
                case 9:
                    button[i] = (Button) findViewById(R.id.add_button);
                    break;
                case 10:
                    button[i] = (Button) findViewById(R.id.subtract_button);
                    break;
                case 11:
                    button[i] = (Button) findViewById(R.id.multiply_button);
                    break;
                case 12:
                    button[i] = (Button) findViewById(R.id.divide_button);
                    break;
                case 13:
                    button[i] = (Button) findViewById(R.id.equals_button);
                    break;
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        for (int x = 0; x < _Max; x++) {
            button[x].setOnClickListener(this);

/**
 for(int i = 0; i < _Max; i++) {
 switch(i){
 case 9: // +
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(first_Num > 0 && second_Num >0) {
 textView.setText(first_Num + second_Num);
 }
 }
 });
 break;
 case 10: // -
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(first_Num > 0 && second_Num >0) {
 textView.setText(first_Num + second_Num);
 }
 }
 });
 break;
 case 11: // *
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(first_Num > 0 && second_Num >0) {
 textView.setText(first_Num + second_Num);
 }
 }
 });
 break;
 case 12: // /
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(first_Num > 0 && second_Num >0) {
 textView.setText(first_Num + second_Num);
 }
 }
 });
 break;
 case 13: // =
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(first_Num > 0 && second_Num >0) {
 textView.setText(first_Num + second_Num);
 }
 }
 });
 break;
 default:
 button[i].
 // Listener for all number buttons
 button[i].setOnClickListener(new View.OnClickListener(){
 public void onClick(View v){
 if(!(first_Num > 0)){

 textView.setText(temp);
 }else if(!(second_Num > 0)){

 }
 }
 });
 break;
 }
 }
 */

        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Adding:
            case R.id.add_button:
                answer=first_Num+second_Num;
                break;
            //Subtracting:
            case R.id.subtract_button:
                answer=first_Num-second_Num;
                break;
            // Multiplying:
            case R.id.multiply_button:
                answer=first_Num*second_Num;
                break;
            // Dividing:
            case R.id.divide_button:
                answer=first_Num/second_Num;
                break;
            // Displaying answer
            case R.id.equals_button:
                //textView.invalidate();
                //textView.setText("Updated");
                textView.setText(Integer.toString(answer));
                break;
            default:
                // Saving the numbers:
                if (first_Num == 0) {
                    first_Num=Integer.parseInt(textView.getText().toString());
                } else if (second_Num == 0) {
                    second_Num=Integer.parseInt(textView.getText().toString());
                }
                break;
        }

    }
}