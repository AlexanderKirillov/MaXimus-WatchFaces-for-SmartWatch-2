package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f62 extends SmartWatch2ClockWidget {

    public f62(WidgetBundle widgetBundle) {
        super(widgetBundle);
    }
    
    @Override
    public int getWidth() {
        return getCellWidth() * 5;
    }


    @Override
    public int getHeight() {
        return getCellHeight() * 3;
    }

    @Override
    int getWidgetLayout() {
        return R.layout.f62;
    }


    @Override
    public int getName() {
        return R.string.f62;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f62pre;
    }
}
