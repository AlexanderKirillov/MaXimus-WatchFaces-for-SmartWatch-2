package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f71 extends SmartWatch2ClockWidget {

    public f71(WidgetBundle widgetBundle) {
        super(widgetBundle);
    }
    
    @Override
    public int getWidth() {
        return getCellWidth() * 5;
    }


    @Override
    public int getHeight() {
        return getCellHeight() * 5;
    }

    @Override
    int getWidgetLayout() {
        return R.layout.f71;
    }


    @Override
    public int getName() {
        return R.string.f71;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f71pre;
    }
}
