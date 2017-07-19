package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f67 extends SmartWatch2ClockWidget {

    public f67(WidgetBundle widgetBundle) {
        super(widgetBundle);
    }
    
    @Override
    public int getWidth() {
        return getCellWidth() * 5;
    }


    @Override
    public int getHeight() {
        return getCellHeight() * 2;
    }

    @Override
    int getWidgetLayout() {
        return R.layout.f67;
    }


    @Override
    public int getName() {
        return R.string.f67;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f67pre;
    }
}
