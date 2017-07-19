package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f69 extends SmartWatch2ClockWidget {

    public f69(WidgetBundle widgetBundle) {
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
        return R.layout.f69;
    }


    @Override
    public int getName() {
        return R.string.f69;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f69pre;
    }
}
