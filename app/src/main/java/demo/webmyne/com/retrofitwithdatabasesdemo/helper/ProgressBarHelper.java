package demo.webmyne.com.retrofitwithdatabasesdemo.helper;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class ProgressBarHelper implements ProgressListener {
    ProgressDialog dialog;

    public ProgressBarHelper(Context context, boolean isCancelable) {
        dialog = new ProgressDialog(context);
        dialog.setCancelable(isCancelable);
        dialog.setCanceledOnTouchOutside(isCancelable);
        dialog.setMessage("Please wait...");
    }
    @Override
    public void showProgressDialog() {
        if (dialog != null) {
            dialog.show();
        }
    }

    @Override
    public void hideProgressDialog() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
