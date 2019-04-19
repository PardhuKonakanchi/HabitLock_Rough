package com.example.pardhu.habitlock_rough;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import org.w3c.dom.Text;

public class NewHabitScreen extends AppCompatActivity {
    /*
    This activity will be the process of creating a new habit
    Users will be able to enter the habit, set up timings for notifications,
    (perhaps connect to Google Calendar) and other features to be thought of.

     */
    TextInputEditText habitName;
    Button addHabitButton;
    TextInputEditText habitDays;
    TextInputEditText habitTime;
    Switch notifications;
    Switch appLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_habit_screen);

        addHabitButton = (Button) findViewById(R.id.addHabitBtn);

        addHabitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Once added new class uncomment so button sends to next page
                //TODO: Send information of the input texts towards use in calendar
                //and storing habit name
                habitName = (TextInputEditText) findViewById(R.id.habitName);
                habitDays = (TextInputEditText) findViewById(R.id.habitDays);
                habitTime = (TextInputEditText) findViewById(R.id.habitTime);
                String nameOfNewHabit = habitName.getText().toString();
                String timeOfNewHabit = habitTime.getText().toString();
                String daysOfNewHabit = habitDays.getText().toString();

                //Intent i = new Intent(this, HabitPreferences.class);
                //i.putExtra("HABIT_NAME", habitName)
                //i.putExtra("HABIT_DAYS", habitDays)
                //i.putExtra("HABIT_TIME", habitTime)
                //startActivity(i);
            }
        });
    }









}
