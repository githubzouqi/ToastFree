package com.example.toastfree.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Toast;

public class ToastFree {

    private static ToastFree toastFree;

    private ToastFree(){}

    public static ToastFree instance(){
        if (toastFree == null){
            synchronized (ToastFree.class){
                if (toastFree == null){
                    toastFree = new ToastFree();
                }
            }
        }
        return toastFree;
    }


    // short to display the message
    public void showTextShort(@NonNull Context context, @NonNull String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    // long to display the message
    public void showTextLong(@NonNull Context context, @NonNull String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }



}
