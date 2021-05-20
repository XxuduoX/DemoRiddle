package sg.edu.rp.c346.id20007998.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvDisplay=findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        if (questionsSelected.equals("Q1")){
            tvDisplay.setText(questionsSelected + " answer is: Queue");
        }else{
            tvDisplay.setText(questionsSelected + " answer is: Gone");
        }

    }
}