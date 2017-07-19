package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f66 extends SmartWatch2ClockWidget {

    public f66(WidgetBundle widgetBundle) {
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
        return R.layout.f66;
    }


    @Override
    public int getName() {
        return R.string.f66;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.f66pre;
    }
}
