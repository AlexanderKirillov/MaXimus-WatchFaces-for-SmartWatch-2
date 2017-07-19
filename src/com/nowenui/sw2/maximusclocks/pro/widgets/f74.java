package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f74 extends SmartWatch2ClockWidget {

    public f74(WidgetBundle widgetBundle) {
        super(widgetBundle);
    }
    
    @Override
    public int getWidth() {
        return getCellWidth() * 2;
    }


    @Override
    public int getHeight() {
        return getCellHeight() * 2;
    }

    @Override
    int getWidgetLayout() {
        return R.layout.f74;
    }


    @Override
    public int getName() {
        return R.string.f74;
    }

   @Override
    public int getPreviewUri() {
        return R.drawable.f74pre;
    }
}
