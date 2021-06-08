package com.yalantis.ucrop.util;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class ColorFilterCompat {

    public static void setColorFilter(Drawable drawable, int color) {
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
            } else {
                drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    public static void setColorFilter(ImageView imageView, int color) {
        if (imageView != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                imageView.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
            } else {
                imageView.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

}
