package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Calculates total score and displays number correct.
     */
    public void submitAnswers(View view) {
        int score = 0;

        score = score + checkFirst() + checkSecond() + checkThird() + checkFourth() + checkFifth() + checkSixth() + checkSeventh() + checkEighth() + checkNinth() + checkTenth();

        Toast toast = Toast.makeText(this, getString(R.string.toast, score), Toast.LENGTH_LONG);
        toast.show();
    }

    /*
     * Checks first question.
     */
    private int checkFirst() {
        int first = 0;

        RadioButton radio1a = (RadioButton) findViewById(R.id.radio1a);
        boolean isRadio1a = radio1a.isChecked();

        RadioButton radio1b = (RadioButton) findViewById(R.id.radio1b);
        boolean isRadio1b = radio1b.isChecked();

        RadioButton radio1c = (RadioButton) findViewById(R.id.radio1c);
        boolean isRadio1c = radio1c.isChecked();

        if (isRadio1b) {
            return first;
        } else if (isRadio1c) {
            return first;
        } else if (isRadio1a) {
            first = first + 1;
        }
        return first;
    }

    /*
     * Checks second question.
     */
    private int checkSecond() {
        int second = 0;

        RadioButton radio2a = (RadioButton) findViewById(R.id.radio2a);
        boolean isRadio2a = radio2a.isChecked();

        RadioButton radio2b = (RadioButton) findViewById(R.id.radio2b);
        boolean isRadio2b = radio2b.isChecked();

        RadioButton radio2c = (RadioButton) findViewById(R.id.radio2c);
        boolean isRadio2c = radio2c.isChecked();

        if (isRadio2b) {
            second = second + 1;
        }
        return second;
    }

    /*
     * Checks third question.
     */
    private int checkThird() {
        int third = 0;

        RadioButton radio3a = (RadioButton) findViewById(R.id.radio3a);
        boolean isRadio3a = radio3a.isChecked();

        RadioButton radio3b = (RadioButton) findViewById(R.id.radio3b);
        boolean isRadio3b = radio3b.isChecked();

        RadioButton radio3c = (RadioButton) findViewById(R.id.radio3c);
        boolean isRadio3c = radio3c.isChecked();

        if (isRadio3a) {
            return third;
        } else if (isRadio3c) {
            return third;
        } else if (isRadio3b) {
            third = third + 1;
        }
        return third;
    }

    /*
     * Checks fourth question.
     */
    private int checkFourth() {
        int fourth = 0;

        RadioButton radio4a = (RadioButton) findViewById(R.id.radio4a);
        boolean isRadio4a = radio4a.isChecked();

        RadioButton radio4b = (RadioButton) findViewById(R.id.radio4b);
        boolean isRadio4b = radio4b.isChecked();

        RadioButton radio4c = (RadioButton) findViewById(R.id.radio4c);
        boolean isRadio4c = radio4c.isChecked();

        if (isRadio4b) {
            return fourth;
        } else if (isRadio4c) {
            return fourth;
        } else if (isRadio4a) {
            fourth = fourth + 1;
        }
        return fourth;
    }

    /*
     * Checks fifth question.
     */
    private int checkFifth() {
        int fifth = 0;

        RadioButton radio5a = (RadioButton) findViewById(R.id.radio5a);
        boolean isRadio5a = radio5a.isChecked();

        RadioButton radio5b = (RadioButton) findViewById(R.id.radio5b);
        boolean isRadio5b = radio5b.isChecked();

        RadioButton radio5c = (RadioButton) findViewById(R.id.radio5c);
        boolean isRadio5c = radio5c.isChecked();

        if (isRadio5a) {
            return fifth;
        } else if (isRadio5b) {
            return fifth;
        } else if (isRadio5c) {
            fifth = fifth + 1;
        }
        return fifth;
    }

    /*
     * Checks sixth question.
     */
    private int checkSixth() {
        int sixth = 0;

        CheckBox checkbox1a = findViewById(R.id.checkbox1a);
        boolean isCheckbox1a = checkbox1a.isChecked();

        CheckBox checkbox1b = findViewById(R.id.checkbox1b);
        boolean isCheckbox1b = checkbox1b.isChecked();

        CheckBox checkbox1c = findViewById(R.id.checkbox1c);
        boolean isCheckbox1c = checkbox1c.isChecked();

        if (isCheckbox1b) {
            return sixth;
        } else if (isCheckbox1a && isCheckbox1c) {
            sixth = sixth + 1;
        }
        return sixth;
    }

    /*
     * Checks seventh question.
     */
    private int checkSeventh() {
        int seventh = 0;

        CheckBox checkbox2a = findViewById(R.id.checkbox2a);
        boolean isCheckbox2a = checkbox2a.isChecked();

        CheckBox checkbox2b = findViewById(R.id.checkbox2b);
        boolean isCheckbox2b = checkbox2b.isChecked();

        CheckBox checkbox2c = findViewById(R.id.checkbox2c);
        boolean isCheckbox2c = checkbox2c.isChecked();

        if (isCheckbox2a) {
            return seventh;
        } else if (isCheckbox2c) {
            return seventh;
        } else if (isCheckbox2b) {
            seventh = seventh + 1;
        }
        return seventh;
    }

    /*
     * Checks eighth question.
     */
    private int checkEighth() {
        int eighth = 0;

        CheckBox checkbox3a = findViewById(R.id.checkbox3a);
        boolean isCheckbox3a = checkbox3a.isChecked();

        CheckBox checkbox3b = findViewById(R.id.checkbox3b);
        boolean isCheckbox3b = checkbox3b.isChecked();

        CheckBox checkbox3c = findViewById(R.id.checkbox3c);
        boolean isCheckbox3c = checkbox3c.isChecked();

        if (isCheckbox3b) {
            return eighth;
        } else if (isCheckbox3a && isCheckbox3c) {
            eighth = eighth + 1;
        }
        return eighth;
    }

    /*
     * Checks ninth question.
     */
    private int checkNinth() {
        int ninth = 0;

        EditText editText1 = findViewById(R.id.edittext1);
        String enteredEditText1 = editText1.getText().toString();

        if (enteredEditText1.contains("Venezuela")) {
            ninth = ninth + 1;
        } else if (enteredEditText1.contains("venezuela")) {
            ninth = ninth + 1;
        } else if (enteredEditText1.contains("VENEZUELA")) {
            ninth = ninth + 1;
        }

        return ninth;

    }

    /*
     * Checks tenth question.
     */
    private int checkTenth() {
        int tenth = 0;

        EditText editText2 = findViewById(R.id.edittext2);
        String enteredEditText2 = editText2.getText().toString();

        if (enteredEditText2.contains("Morocco")) {
            tenth = tenth + 1;
        } else if (enteredEditText2.contains("morocco")) {
            tenth = tenth + 1;
        } else if (enteredEditText2.contains("MOROCCO")) {
            tenth = tenth + 1;
        }

        return tenth;

    }

}
