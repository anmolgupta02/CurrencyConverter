package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button euroButton, dollarButton, poundButton, dhiramButton, btcButton, yenButton, rubelButton,
            ausButton, canButton;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        euroButton = findViewById(R.id.eurobtn);
        dollarButton = findViewById(R.id.dollarbtn);
        poundButton = findViewById(R.id.poundbtn);
        dhiramButton = findViewById(R.id.dhirambtn);
        btcButton = findViewById(R.id.btcbtn);
        yenButton = findViewById(R.id.yenbtn);
        rubelButton = findViewById(R.id.rubelbtn);
        ausButton = findViewById(R.id.ausdolbtn);
        canButton = findViewById(R.id.candolbtn);

        euroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.012;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        dollarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.013;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        poundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.011;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        yenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 1.38;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        dhiramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.048;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        btcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.0000014;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        rubelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.97;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        ausButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.021;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });

        canButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUser = editText.getText().toString();

                if(TextUtils.isEmpty(textFromUser)){

                    editText.setError("Nothing Recieved From user");

                }else{
                    double mainText, convertedText;

                    mainText = Double.parseDouble(textFromUser);
                    textView.setText(null);
                    convertedText = mainText * 0.019;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(convertedText));

                }
            }
        });
    }
}
