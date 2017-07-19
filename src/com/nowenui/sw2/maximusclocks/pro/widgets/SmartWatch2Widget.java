/*
Copyright (c) 2011, Sony Ericsson Mobile Communications AB
Copyright (c) 2011-2014, Sony Mobile Communications AB

 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution.

 * Neither the name of the Sony Ericsson Mobile Communications AB / Sony Mobile
 Communications AB nor the names of its contributors may be used to endorse or promote
 products derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.nowenui.sw2.maximusclocks.pro.widgets;

import android.util.Log;

import com.nowenui.sw2.maximusclocks.pro.ClockWidgetExtensionService;
import com.nowenui.sw2.maximusclocks.pro.R;
import com.sonyericsson.extras.liveware.extension.util.widget.BaseWidget;

public abstract class SmartWatch2Widget extends BaseWidget {

    public SmartWatch2Widget(WidgetBundle widgetBundle) {
        super(widgetBundle);
        Log.d(ClockWidgetExtensionService.LOG_TAG, "Widget Create");
    }

    abstract int getWidgetLayout();

    /**
     * Sends a set of predefined layouts.
     */
    private void updateWidget() {
        Log.d(ClockWidgetExtensionService.LOG_TAG, "Show layout");
        int layoutId = getWidgetLayout();
        // We use the same layout for all AccessoryStates by providing the same
        // layout ID for the three first parameters.
        showLayout(layoutId, layoutId, layoutId, null);
    }

    @Override
    public void onStartRefresh() {
        Log.d(ClockWidgetExtensionService.LOG_TAG, "Widget visible");
        updateWidget();
    }

    @Override
    public void onStopRefresh() {
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.iconshka;
    }

    @Override
    public int getName() {
        return R.string.app_name;
    }

    /**
     * Returns the SmartWatch 2 defined cell width.
     *
     * @return The width in pixels.
     */
    protected int getCellWidth() {
        return mContext.getResources().getDimensionPixelSize(
                R.dimen.smart_watch_2_widget_cell_width);
    }

    /**
     * Returns the SmartWatch 2 defined cell height.
     *
     * @return The height in pixels.
     */
    protected int getCellHeight() {
        return mContext.getResources().getDimensionPixelSize(
                R.dimen.smart_watch_2_widget_cell_height);
    }
}
