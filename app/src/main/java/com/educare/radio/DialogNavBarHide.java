package com.educare.radio;

import android.app.Activity;
import android.app.Dialog;
import android.view.WindowManager;

/**
 * Created by ibrar on 5/25/2016.
 */
public class DialogNavBarHide {

    public static void navBarHide(Activity activity, Dialog dialog) {
        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
        dialog.show();
        dialog.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
    }


}
