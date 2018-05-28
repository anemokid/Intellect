package com.example.sweetseedsapp.controllersandviews;

import android.content.ClipData;
import android.view.View;

/**
 * Created by vivianbabiryekulumba on 5/27/18.
 */

public class LongPressListener implements View.OnLongClickListener {

    @Override
    public boolean onLongClick(View view) {
        final ClipData data = ClipData.newPlainText("", "");
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
        view.startDrag(data, shadowBuilder, view, 0);
        view.setVisibility(View.INVISIBLE);
        return true;
    }
}