package com.nowenui.sw2.maximusclocks.pro.widgets;

import com.nowenui.sw2.maximusclocks.pro.R;

public class f76 extends SmartWatch2ClockWidget {

    public f76(WidgetBundle widgetBundle) {
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
        return R.layout.f76;
    }


    @Override
    public int getName() {
        return R.string.f76;
    }

   @Override
    public int getPreviewUri() {
        return R.drawable.f76pre;
    }
}
