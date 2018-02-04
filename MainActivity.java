package com.example.android.biochemistryquiz;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        int sumOfThePoints =0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /**
         * This method displays the given message on the screen and the toast message.
         */

        public void displayMessage(View view) {

            RadioButton firstQuestion = (RadioButton) findViewById(R.id.firstQuestionAnswer);
            if (firstQuestion.isChecked()) {
                sumOfThePoints += 1;
            }


            RadioButton secondQuestion = (RadioButton) findViewById(R.id.secondQuestionAnswer);
            if (secondQuestion.isChecked()) {
                sumOfThePoints += 1;
            }

            CheckBox Fructose = (CheckBox) findViewById(R.id.Fructose);
            if (Fructose.isChecked()) {
                sumOfThePoints += 1;
            }

            CheckBox Glucose = (CheckBox) findViewById(R.id.Glucose);
            if (Glucose.isChecked()) {
                sumOfThePoints += 1;
            }

            RadioButton fourthQuestion = (RadioButton) findViewById(R.id.fourthQuestionAnswer);
            if (fourthQuestion.isChecked()) {
                sumOfThePoints += 1;
            }


            RadioButton fifthQuestion = (RadioButton) findViewById(R.id.fifthQuestionAnswer);
            if (fifthQuestion.isChecked()) {
                sumOfThePoints += 1;
            }

            RadioButton sixthQuestion = (RadioButton) findViewById(R.id.sixthQuestionAnswer);
            if (sixthQuestion.isChecked()) {
                sumOfThePoints += 1;
            }

            RadioButton sevenQuestion = (RadioButton) findViewById(R.id.sevenQuestionAnswer);
            if (sevenQuestion.isChecked()) {
                sumOfThePoints += 1;
            }

            RadioButton eightQuestion = (RadioButton) findViewById(R.id.eightQuestionAnswer);
            if (eightQuestion.isChecked()) {
                sumOfThePoints += 1;
            }


            RadioButton ninthQuestion = (RadioButton) findViewById(R.id.ninthQuestionAnswer);
            if (ninthQuestion.isChecked()) {
                sumOfThePoints += 1;
            }

            RadioButton tenthQuestion = (RadioButton) findViewById(R.id.tenthQuestionAnswer);
            if (tenthQuestion.isChecked()) {
                sumOfThePoints += 1;
            }


            TextView showResults = findViewById(R.id.results);


            String first_sentence = "You got: ";
            String points= "points";
            String second_sentence_first_option = "You know something about biochemistry.";
            String third_sentence_first_option = "Good job! And keep on learning";
            String second_sentence_second_option = "You know a lot about biochemistry.";
            String third_sentence_second_option = "Good job!";
            String second_sentence_third_option = "You are the best.";



            String returnMessage = first_sentence + sumOfThePoints +" " + points;

            if (sumOfThePoints < 4 && sumOfThePoints>0) {
                returnMessage += "\n" + second_sentence_first_option;
                returnMessage += "\n" + third_sentence_first_option;
            }

            if (sumOfThePoints < 10 && sumOfThePoints> 4) {
                returnMessage += "\n" + second_sentence_second_option;
                returnMessage += "\n" + third_sentence_second_option;
            }

            if (sumOfThePoints == 10) {
                returnMessage += "\n" + second_sentence_third_option;
                returnMessage += "\n" + third_sentence_second_option;
            }

            showResults.setText(returnMessage);


            Context context = getApplicationContext();
            CharSequence text = first_sentence + " " + sumOfThePoints + " " + points;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.BOTTOM,0,0);
            toast.show();
        }


    }
