package com.codeclan.example.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
//
    private EditText questionEditText;
    private Button calculateButton;
    private TextView answerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question_text);
        calculateButton = (Button)findViewById(R.id.calculate_button);
        answerText = (TextView)findViewById(R.id.answer_text);
    }

    public void onCalculateButtonClick(View button) {

        WordCounter count = new WordCounter("");
        answerText.setText(count.getWordCount());

    }
}





