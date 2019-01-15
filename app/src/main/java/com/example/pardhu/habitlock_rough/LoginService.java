package com.example.pardhu.habitlock_rough;


import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

//Service to run during Login Process

public class LoginService extends Service {

    /* An IBinder has the method onBind which returns the binder we've created which returns MyLocalBinder
    which returns the PardhusService class
     */

    private IBinder pardhuBinder = new MyLocalBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return pardhuBinder;
    }

    public boolean checkRegistration(String usernameInput, String passwordInput){
        //TODO: First check allow this function to check with databse to return if authenticated. Then add ability to return data to find user shared preferences.
        return true;
    }


    public class MyLocalBinder extends Binder {
        LoginService getService(){
            return LoginService.this;
        }

    }
}

