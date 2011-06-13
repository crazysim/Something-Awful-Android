package com.ferg.awful.dialog;

import android.app.AlertDialog;
import android.content.Context;
import com.ferg.awful.R;

public class LogOutDialog extends AlertDialog {
    public LogOutDialog(Context context) {
        super(context);
        setTitle(context.getString(R.string.logout));
        setMessage(context.getString(R.string.logout_message));
    }
}