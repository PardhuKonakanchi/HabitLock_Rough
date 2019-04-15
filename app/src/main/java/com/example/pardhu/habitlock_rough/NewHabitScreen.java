package com.example.pardhu.habitlock_rough;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewHabitScreen extends AppCompatActivity {
    /*
    This activity will be the process of creating a new habit
    Users will be able to enter the habit, set up timings for notifications,
    (perhaps connect to Google Calendar) and other features to be thought of.

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_habit_screen);
    }
}
