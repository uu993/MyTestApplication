package com.example.demoone;


import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by hanhanliu on 15/5/13.
 */
public class AndTools {

    /**
     * 获取屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context) {

        if (context != null) {
            WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics dm = new DisplayMetrics();
            manager.getDefaultDisplay().getMetrics(dm);
            int width = dm.widthPixels;

            return width;
        }
        return 0;
    }

}
