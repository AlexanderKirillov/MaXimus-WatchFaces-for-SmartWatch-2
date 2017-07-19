package com.nowenui.sw2.maximusclocks.pro;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.nowenui.sw2.maximusclocks.pro.R;
import com.nowenui.sw2.maximusclocks.pro.widgets.*;
import com.sonyericsson.extras.liveware.aef.registration.Registration;
import com.sonyericsson.extras.liveware.extension.util.ExtensionUtils;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;
import com.sonyericsson.extras.liveware.extension.util.registration.WidgetContainer;

import java.util.UUID;


public class ClockWidgetRegistrationInformation extends RegistrationInformation {

    final Context mContext;
    private String extensionKey;
    private static final String EXTENSION_KEY_PREF = "EXTENSION_KEY_PREF";

   
    protected ClockWidgetRegistrationInformation(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        mContext = context;
    }

    @Override
    public int getRequiredWidgetApiVersion() {
       
        return 3;
    }

    @Override
    public int getTargetWidgetApiVersion() {
        return 3;
    }

    @Override
    public int getRequiredNotificationApiVersion() {
        return API_NOT_REQUIRED;
    }

    @Override
    public int getRequiredControlApiVersion() {
        return API_NOT_REQUIRED;
    }

    @Override
    public int getRequiredSensorApiVersion() {
        return API_NOT_REQUIRED;
    }

    @Override
    public boolean isWidgetSizeSupported(final int width, final int height) {
        return true;
    }

    @Override
    protected WidgetClassList getWidgetClasses(Context context, String hostAppPackageName,
            WidgetContainer widget) {
       
        WidgetClassList widgetList = new WidgetClassList();
        widgetList.add(Date1.class);
        widgetList.add(Date2.class);
        widgetList.add(Date3.class);
		widgetList.add(Date4.class);
		widgetList.add(Date5.class);
		widgetList.add(Date6.class);
		widgetList.add(Date7.class);
		widgetList.add(Date8.class);
        widgetList.add(Date9.class);
        widgetList.add(Date10.class);
		widgetList.add(Date11.class);
		widgetList.add(Date12.class);
		widgetList.add(Date13.class);
		widgetList.add(Date14.class);
		widgetList.add(Date15.class);
		widgetList.add(Date16.class);
		widgetList.add(Date17.class);
		widgetList.add(Date18.class);
		widgetList.add(Date19.class);
		widgetList.add(Date20.class);
		widgetList.add(Date21.class);
		widgetList.add(Date22.class);
		widgetList.add(Date23.class);
		widgetList.add(Date24.class);
		widgetList.add(Date25.class);
		widgetList.add(Date26.class);
        widgetList.add(d1.class);
        widgetList.add(d2.class);
        widgetList.add(d3.class);
        widgetList.add(d4.class);
        widgetList.add(d5.class);
        widgetList.add(d6.class);
        widgetList.add(d7.class);
        widgetList.add(d8.class);
        widgetList.add(d9.class);
        widgetList.add(f10.class);
        widgetList.add(f11.class);
        widgetList.add(f12.class);
		widgetList.add(f13.class);
		widgetList.add(f14.class);
		widgetList.add(f15.class);
		widgetList.add(f16.class);
		widgetList.add(f17.class);
		widgetList.add(f18.class);
		widgetList.add(f19.class);
		widgetList.add(f20.class);
		widgetList.add(f21.class);
		widgetList.add(f22.class);
		widgetList.add(f23.class);
		widgetList.add(f24.class);
		widgetList.add(f25.class);
		widgetList.add(f26.class);
		widgetList.add(f27.class);
		widgetList.add(f28.class);
		widgetList.add(f29.class);
		widgetList.add(f30.class);
		widgetList.add(f31.class);
		widgetList.add(f32.class);
		widgetList.add(f33.class);
		widgetList.add(f34.class);
		widgetList.add(f35.class);
		widgetList.add(f36.class);
		widgetList.add(f37.class);
		widgetList.add(f38.class);
		widgetList.add(f39.class);
		widgetList.add(f40.class);
		widgetList.add(f41.class);
		widgetList.add(f42.class);
		widgetList.add(f43.class);
		widgetList.add(f44.class);
		widgetList.add(f45.class);
		widgetList.add(f46.class);
		widgetList.add(f47.class);
		widgetList.add(f48.class);
		widgetList.add(f49.class);
		widgetList.add(f50.class);
		widgetList.add(f51.class);
		widgetList.add(f52.class);
		widgetList.add(f53.class);
		widgetList.add(f54.class);
		widgetList.add(f55.class);
		widgetList.add(f56.class);
		widgetList.add(f57.class);
		widgetList.add(f58.class);
		widgetList.add(f59.class);
		widgetList.add(f60.class);
		widgetList.add(f61.class);
		widgetList.add(f62.class);
		widgetList.add(f63.class);
		widgetList.add(f64.class);
		widgetList.add(f65.class);
		widgetList.add(f66.class);
		widgetList.add(f67.class);
		widgetList.add(f68.class);
		widgetList.add(f69.class);
		widgetList.add(f70.class);
		widgetList.add(f71.class);
		widgetList.add(f72.class);
		widgetList.add(f74.class);
		widgetList.add(f75.class);
		widgetList.add(f76.class);
        widgetList.add(a1.class);
        widgetList.add(a2.class);
        widgetList.add(a3.class);
		widgetList.add(a4.class);
	    widgetList.add(a5.class);
	    widgetList.add(a6.class);
	    widgetList.add(a7.class);
	    widgetList.add(a8.class);
	    widgetList.add(a9.class);
	    widgetList.add(a10.class);
	    widgetList.add(a11.class);
		widgetList.add(a12.class);
		widgetList.add(a13.class);
		widgetList.add(a14.class);
		widgetList.add(a15.class);
		widgetList.add(a16.class);
        return widgetList;

    }

    @Override
    public ContentValues getExtensionRegistrationConfiguration() {
        String iconHostapp = ExtensionUtils.getUriString(mContext, R.drawable.iconshka);
        String iconExtension = ExtensionUtils.getUriString(mContext, R.drawable.iconshka);

        ContentValues values = new ContentValues();

        values.put(Registration.ExtensionColumns.CONFIGURATION_ACTIVITY,
                ClockWidgetPreferenceActivity.class.getName());
        values.put(Registration.ExtensionColumns.CONFIGURATION_TEXT,
                mContext.getString(R.string.app_name));
        values.put(Registration.ExtensionColumns.NAME, mContext.getString(R.string.app_name));
        values.put(Registration.ExtensionColumns.EXTENSION_KEY, getExtensionKey());
        values.put(Registration.ExtensionColumns.HOST_APP_ICON_URI, iconHostapp);
        values.put(Registration.ExtensionColumns.EXTENSION_ICON_URI, iconExtension);
        values.put(Registration.ExtensionColumns.NOTIFICATION_API_VERSION,
                getRequiredNotificationApiVersion());
        values.put(Registration.ExtensionColumns.PACKAGE_NAME, mContext.getPackageName());
        return values;
    }

    @Override
    public synchronized String getExtensionKey() {
        if (TextUtils.isEmpty(extensionKey)) {
            SharedPreferences pref = mContext.getSharedPreferences(EXTENSION_KEY_PREF,
                    Context.MODE_PRIVATE);
            extensionKey = pref.getString(EXTENSION_KEY_PREF, null);
            if (TextUtils.isEmpty(extensionKey)) {
                extensionKey = UUID.randomUUID().toString();
                pref.edit().putString(EXTENSION_KEY_PREF, extensionKey).commit();
            }
        }
        return extensionKey;
    }

}
