package com.prince.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView totalQuestionTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    int score = 0;
    int totalquestion = QuestionAnswer.questions.length;
    int currrentquestionindex = 0;
    String selectedanswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalQuestionTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        totalQuestionTextView.setText("Total Question:" + totalquestion);
        loadNewQuestion();

    }


    @Override
    public void onClick(View v) {
        ansA.setTextColor(Color.WHITE);
        ansB.setTextColor(Color.WHITE);
        ansC.setTextColor(Color.WHITE);
        ansD.setTextColor(Color.WHITE);
        ansA.setBackgroundColor(Color.BLUE);
        ansB.setBackgroundColor(Color.BLUE);
        ansC.setBackgroundColor(Color.BLUE);
        ansD.setBackgroundColor(Color.BLUE);
        Button clickedButton = (Button) v;
        if (clickedButton.getId() == R.id.submit_btn) {
            if (selectedanswer.equals(QuestionAnswer.correctAnswers[currrentquestionindex])) {
                score++;
            }
            currrentquestionindex++;
            loadNewQuestion();

        } else {
            selectedanswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GREEN);
        }

    }

    void loadNewQuestion() {
        if (currrentquestionindex == totalquestion) {
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswer.questions[currrentquestionindex]);
        ansA.setText(QuestionAnswer.choices[currrentquestionindex][0]);
        ansB.setText(QuestionAnswer.choices[currrentquestionindex][1]);
        ansC.setText(QuestionAnswer.choices[currrentquestionindex][2]);
        ansD.setText(QuestionAnswer.choices[currrentquestionindex][3]);
    }

    void finishQuiz() {
        String passStatus = "";
        if (score > totalquestion * 0.6) {
            passStatus = "passed";
        } else {
            passStatus = "failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus).setMessage("Score is" + score + "out of" + totalquestion)
                .setPositiveButton("Restart", (dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .show();
    }
void restartQuiz(){
        score=0;
        currrentquestionindex=0;
        loadNewQuestion();
}

}