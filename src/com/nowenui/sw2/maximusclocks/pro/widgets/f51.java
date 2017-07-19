package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f51 extends SmartWatch2ClockWidget {

    public f51(WidgetBundle widgetBundle) {
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
        return R.layout.f51;
    }


    @Override
    public int getName() {
        return R.string.f51;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f51pre;
    }
}
