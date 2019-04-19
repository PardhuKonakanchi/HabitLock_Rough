package com.example.pardhu.habitlock_rough;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

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
                String[] timeArray = habitTime.getText().toString().split(":");
                int hour = Integer.parseInt(timeArray[0]);
                int minute = Integer.parseInt(timeArray[1]);
                if (hour > 12 || minute > 60) {
                    Toast toast = new Toast(getApplicationContext());
                    toast.setMargin(50, 50);
                    toast.setText("Your requested timing isn't real. Remember we actuall" +
                            "want to do this!");
                    toast.show();
                    return;
                }
                String daysOfNewHabit = habitDays.getText().toString();

                /*
                Next few lines are code to send Calendar intent
                Need to figure out how this exactly works so users
                can easily connect. Main thing is I have to pull today's date
                and set up recurring events based on users days of week input
                 */
                Calendar beginTime = Calendar.getInstance();
                beginTime.set(2012, 0, 19, hour, minute);

                Calendar endTime = Calendar.getInstance();
                endTime.set(2012, 0, 19, hour+1, minute);

                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setData(CalendarContract.Events.CONTENT_URI);
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis());
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis());

                intent.putExtra(CalendarContract.Events.TITLE, nameOfNewHabit);



                //Intent i = new Intent(this, HabitPreferences.class);
                //i.putExtra("HABIT_NAME", habitName)
                //i.putExtra("HABIT_DAYS", habitDays)
                //i.putExtra("HABIT_TIME", habitTime)
                //startActivity(i);
            }
        });
    }









}
